package es.ua.dlsi.grfia.im4.core.semantic.io.grammar;

import es.ua.dlsi.grfia.im4.core.IM4Exception;
import es.ua.dlsi.grfia.im4.core.TestFileUtils;
import es.ua.dlsi.grfia.im4.core.semantic.SemanticComposition;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertTrue;

public class SkmImporterTest {
    @Test
    public void importSKernMens() throws IM4Exception, FileNotFoundException {
        String [] testFileNames = {
                /*

                        KERN  TESTS
                 */
                "skern/jorge.skm", // Ejemplo 1
                "skern/octaves.skm", // Octavas 1
                "skern/barlines/barlines.skm",
                "skern/barlines/barlines2.skm",
                "skern/changeconfiguration.skm",
                "skern/timesignature/timesignature.skm",    // Basic configuration
                "skern/timesignature/timesignature1.skm",    // Common metter different times
                "skern/timesignature/fraction.skm",
                "skern/accidents/accident1.skm",             // Natural, flat, sharp
                "skern/accidents/accident2.skm",             // bracket accident and parenthe
                "skern/keysignature/keysignature1.skm",    //
                "skern/keysignature/keysignature2.skm",    //
                "skern/keysignature/keysignature3.skm",    // Deberia dar error?
                "skern/dots/augmentationDots.skm",
                "skern/chords.skm",            // dejar los chord con comas entre ellos?
                "skern/rhythm/rhythm.skm",
                "skern/ties/ties1.skm",
                "skern/ties/ties2.skm",
                "skern/ties/ties3.skm",            // rehacer ties por los chords?
                "skern/beaming/beaming0.skm",
                "skern/beaming/beaming1.skm",
                "skern/beaming/beaming2.skm",
                "skern/beaming/partialbeaming0.skm",
                "skern/rests/rest1.skm",
                "skern/slurs/slur1.skm",
                "skern/slurs/slur2.skm",
                "skern/notes/notename.skm",
                "skern/ornaments/ornaments0.skm",
                "skern/ornaments/ornaments1.skm",
                "skern/ornaments/ornaments2.skm",
                "skern/ornaments/ornaments3.skm",
                "skern/ornaments/ornaments4.skm",
                "skern/ornaments/ornaments5.skm",
                "skern/ornaments/ornaments6.skm",
                "skern/articulations/articulations0.skm",
                "skern/articulations/articulations1.skm",
                "skern/articulations/articulations2.skm",
                "skern/articulations/articulations3.skm",
                "skern/articulations/articulations4.skm",
                "skern/articulations/articulations5.skm",
                "skern/articulations/articulations6.skm",
                "skern/articulations/articulations7.skm",
                "skern/time.skm",
                "skern/notes/notesFullAdds.skm",
                "skern/stemDirection/stemdirection0.skm",
                "skern/stemDirection/stemdirection1.skm",
                "skern/meterCommon/commonmeter1.skm",
                "skern/meterCommon/commonmeter2.skm",

                /*                  MENS                */
                "smens/inicio.skm",
                "smens/meter/commonmeter1.skm",
                "smens/meter/commonmeter2.skm",
                "smens/meter/commonmeter3.skm",
                "smens/meter/commonmeter4.skm",
                "smens/meter/commonmeter6.skm",
                "smens/meter/commonmeter7.skm",
                "smens/meter/commonmeter8.skm",
                "smens/meter/commonmeter9.skm",
                "smens/meter/commonmeter10.skm",
                "smens/meter/commonmeter11.skm",
                "smens/meter/commonmeter12.skm",
                "smens/meter/perfectmeter1.skm",
                "smens/meter/perfectmeter2.skm",
                "smens/meter/perfectmeter3.skm",
                "smens/meter/perfectmeter4.skm",
                "smens/meter/perfectmeter5.skm",
                "smens/meter/perfectmeter6.skm",
                "smens/meter/perfectmeter7.skm",
                "smens/meter/perfectmeter8.skm",
                "smens/meter/perfectmeter9.skm",
                "smens/meter/perfectmeter10.skm",
                "smens/rhythm/rhythm1.skm",
                "smens/dot/dot1.skm",
                "smens/notesufix/notesufix.skm",
                "smens/ligature/ligature.skm",
                "smens/slurs/slur2.skm",
                "smens/rest/rest1.skm",
                "smens/barlines/barlines1.skm",
                "smens/notes/note1.skm",

                "horizontalTest/prueba.skm"

        };

        for (String testFileName: testFileNames) {
            SkmSyntaxDirectedTranslation skmSyntaxDirectedTranslation = new SkmSyntaxDirectedTranslation();
            File file = TestFileUtils.getFile("/testdata/io/skm/" + testFileName);
            SemanticComposition imported = skmSyntaxDirectedTranslation.importSkm(file);
            //TODO comprobar contenido - ahora sólo comprueba que no falla

            //imported.printGraphDot(new File("/tmp/composition.dot"));
        }
    }
}
