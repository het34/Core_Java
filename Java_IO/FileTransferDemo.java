package Java_IO;

import java.io.FileReader;
import java.io.FileWriter;

class FileTransferDemo {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("input.txt");

            FileWriter fw = new FileWriter("output.txt");

            int ch;

            while ((ch = fr.read()) != -1) {

                fw.write(ch);
            }

            fr.close();

            fw.close();

            System.out.println("Content Transferred Successfully");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}