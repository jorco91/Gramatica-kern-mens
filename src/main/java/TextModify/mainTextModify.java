package TextModify;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class mainTextModify {

    public static void main(String[] args) throws IOException {
        String ruta = "src/main/resources/ficheros/fichero";
        ReadAndInvertMatix matriz = new ReadAndInvertMatix();
        ArrayList<List<String>> mtr= new ArrayList<List<String>>();
        mtr = matriz.readAndInvert(ruta);
        matriz.RewriteFile(mtr);
    }
}
