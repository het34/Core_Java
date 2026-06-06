package Collections_Framework;

import java.util.HashMap;

class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Het");
        students.put(2, "Raj");

        System.out.println(students);

        System.out.println(students.get(1));
    }
}