package File_Handling;

import java.io.*;

class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }
}

class SerializationDemo {

    public static void main(String[] args) {

        try {

            Student s1 = new Student(1, "Het");

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("student.txt"));

            out.writeObject(s1);

            out.close();

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("student.txt"));

            Student s2 = (Student) in.readObject();

            in.close();

            System.out.println(s2.id + " " + s2.name);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}