package File_Handling;

import java.io.FileReader;
import java.io.FileWriter;

class FileReadWriteDemo {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Hello Java File Handling");

            fw.close();

            FileReader fr = new FileReader("sample.txt");

            int ch;

            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);
            }

            fr.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}