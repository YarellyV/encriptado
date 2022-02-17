import java.io.*;
import java.util.Scanner;

public class Password {
    public static void main (String[] Args) throws IOException {

        String string_original[] = new String[4];
        int cont = 0;

        File doc = new File("src\\test.txt");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine()){
            string_original[cont] = obj.nextLine();
            cont++;
        }

        System.out.println(string_original[0]);
        System.out.println(string_original[1]);
        System.out.println(string_original[2]);
        System.out.println(string_original[3]);


        String cadena = string_original[3];
        cadena = cadena.replaceAll("(.)\\1", "$1");
        cadena = cadena.replaceAll("(.)\\1", "$1");
        System.out.println(cadena);

        File file = new File("src\\output.txt");
        // Si el archivo no existe es creado
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        if(cadena.contains(string_original[1]))
        {
            //System.out.println("SI");
            bw.write("SI \n");
        }
        else
        {
            //System.out.println("NO");
            bw.write("NO \n");
        }

        if(cadena.contains(string_original[2]))
        {
            bw.write("SI");
            //System.out.println("SI");
        }
        else
        {
            //System.out.println("NO");
            bw.write("NO");
        }


        bw.close();
    }
}
