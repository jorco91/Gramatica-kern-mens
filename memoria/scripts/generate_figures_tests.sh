#!/bin/bash
INPUTFOLDER="../../src/test/resources/testdata/io/skm/skern"
OUTPUTFOLDER="../latex/figures_tests"
PDFs="${OUTPUTFOLDER}/pdf/skern"
SVGs="${OUTPUTFOLDER}/svg/skern"
VEROVIO="verovio"
BATIK="batik-1.12"

for skm in $(find $INPUTFOLDER -name *.skm -print); do
	echo "Processing ${skm}"

  filename=$(basename $skm .skm)
  svg="${OUTPUTFOLDER}/svg/skern/${filename}.svg"

  # change **skm for **kern so that Verovio can process it
  cat ${skm} | sed 's/skern/kern/g' > /tmp/kern

	${VEROVIO} --adjust-page-width --adjust-page-height -o ${svg} /tmp/kern
done

java -cp ${BATIK} -jar "${BATIK}/batik-rasterizer-1.12.jar" -m application/pdf -d ${PDFs} ${SVGs}
