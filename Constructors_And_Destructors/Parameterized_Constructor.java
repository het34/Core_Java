package Constructors_And_Destructors;

class Parameterized_Constructor {

    String name;
    int age;

    Parameterized_Constructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Parameterized_Constructor s1 = new Parameterized_Constructor("Het", 22);

        s1.display();
    }
}