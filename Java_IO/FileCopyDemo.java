package Java_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileCopyDemo {

    public static void main(String[] args) {

        try {

            FileInputStream fis =
                    new FileInputStream("source.txt");

            FileOutputStream fos =
                    new FileOutputStream("destination.txt");

            int data;

            while ((data = fis.read()) != -1) {

                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied Successfully");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}