#!/bin/bash
INPUTFOLDER="../../src/test/resources/testdata/io/skm/smens"
OUTPUTFOLDER="../latex/figures_railroad"
BOTTLECAPS="./bottlecaps-railroad/rr.war"
PDFs="${OUTPUTFOLDER}/pdf/smens"
SVGs="${OUTPUTFOLDER}/svg/smens"
BATIK="batik-1.12"
TMPFILE=/tmp/bottlecap-svg.html

# We have created a .ebnf file illustrating the important part of every test
for ebnf in $(find $INPUTFOLDER -name *.ebnf -print); do
	echo "Processing ${ebnf}"

  filename=$(basename $ebnf .ebnf)
  svg="${SVGs}/${filename}.svg"
  # Bottlecaps generate an embedded SVG inside an HTML
  # The sed command is used to remove the namespace for applying xmllint
  java -jar $BOTTLECAPS $ebnf | sed 's/ xmlns=".*"//g'> ${TMPFILE}
  # Extract the svg from the xml
  xmllint --xpath "/html/body/svg" ${TMPFILE} | sed 's/<svg>/<svg xmlns="http:\/\/www.w3.org\/2000\/svg">/'> ${svg}
done

java -cp ${BATIK} -jar "${BATIK}/batik-rasterizer-1.12.jar" -m application/pdf -d ${PDFs} ${SVGs}

