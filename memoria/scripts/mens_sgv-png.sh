#!/bin/bash
INPUTFOLDER="../latex/figures_railroad/svg/smens"
OUTPUTFOLDER="../latex/figures_railroad/png/smens"

# We have created a .ebnf file illustrating the important part of every test
for svg in $(find $INPUTFOLDER -name *.svg -print); do
	echo "Processing ${svg}"

  filename=$(basename $svg .svg)
  svg1="${OUTPUTFOLDER}/${filename}.svg"
  png="${OUTPUTFOLDER}/${filename}.png"
  # Bottlecaps generate an embedded SVG inside an HTML
  # The sed command is used to remove the namespace for applying xmllint

  inkscape -D $svg -o $png


done

echo "Finished all."