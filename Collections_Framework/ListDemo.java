package Collections_Framework;

import java.util.ArrayList;
import java.util.LinkedList;

class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("C");
        linkedList.add("C++");

        System.out.println("ArrayList: " + arrayList);

        System.out.println("LinkedList: " + linkedList);
    }
}