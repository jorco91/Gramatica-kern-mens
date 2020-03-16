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
                //pasado "base.skm",
                "jorge.skm", // Ejemplo 1
                "octaves.skm", // Octavas 1
                "barlines/barlines.skm",
                "barlines/barlines2.skm",
                "changeconfiguration.skm",
                "timesignature/timesignature.skm",    // Basic configuration
                "timesignature/timesignature1.skm",    // Common metter different times
                "timesignature/timesignature3.skm",       //Perfect metter
                "accidents/accident1.skm",             // Natural, flat, sharp
                "accidents/accident2.skm",             // bracket accident and parenthe
                "keysignature/keysignature1.skm",    //
                "keysignature/keysignature2.skm",    //
                "keysignature/keysignature3.skm",    // Deberia dar error?
                "dots/augmentationDots.skm",
                "chords.skm",            // dejar los chord con comas entre ellos?
                "rhythm/rhythm.skm",
                "ties/ties1.skm",
                "ties/ties2.skm",
                //"ties/ties3.skm",            // rehacer ties por los chords?
                "beaming/beaming0.skm",
                "beaming/beaming1.skm",
                "beaming/beaming2.skm",
                "beaming/partialbeaming0.skm",
                "rests/rest1.skm",
                "slurs/slur1.skm",
                "slurs/slur2.skm",
                "notes/notename.skm",
                "ornaments/ornaments0.skm",
                "ornaments/ornaments1.skm",
                "ornaments/ornaments2.skm",
                "ornaments/ornaments3.skm",
                "ornaments/ornaments4.skm",
                "ornaments/ornaments5.skm",
                "ornaments/ornaments6.skm",
                "articulations/articulations0.skm",
                "articulations/articulations1.skm",
                "articulations/articulations2.skm",
                "articulations/articulations3.skm",
                "articulations/articulations4.skm",
                "articulations/articulations5.skm",
                "articulations/articulations6.skm",
                "articulations/articulations7.skm",
                "time.skm",
                "notes/notesFullAdds.skm",
                "stemDirection/stemdirection0.skm",
                "stemDirection/stemdirection1.skm",


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
