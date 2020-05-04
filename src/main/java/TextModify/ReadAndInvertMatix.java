package TextModify;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndInvertMatix {

    private static final String SEPARATOR="\t";

    public ArrayList<List<String>> readAndInvert(String filename) throws IOException {
        BufferedReader buffer = null;
        ArrayList<List<String>> matriz = new ArrayList<List<String>>();


        buffer = new BufferedReader(new FileReader(filename));
        String line = buffer.readLine();

        for(int i=0 ; i<line.split(SEPARATOR).length; i++)      //Vemos cantidad de instrumentacion
            matriz.add(new ArrayList<String>());

        while (null != line) {

            String[] fields = line.split(SEPARATOR);
            for(int i=0 ; i<fields.length; i++)
            {
                matriz.get(i).add(fields[i]);
            }
            line = buffer.readLine();
        }
        System.out.println(matriz);
        return matriz;
    }

    public void RewriteFile(ArrayList<List<String>> mtr)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter("src/test/resources/testdata/io/skm/horizontalTest/prueba.skm");
            pw = new PrintWriter(fichero);
            for(int i = 0; i<mtr.size(); i++) {
                for (int j = 0; j < mtr.get(0).size(); j++) {
                    pw.print(mtr.get(i).get(j));
                    if(j != mtr.get(0).size()-1)
                        pw.print("");
                    System.out.println(mtr.get(i).get(j));
                }
                if( i != mtr.size()-1)
                    pw.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


}
