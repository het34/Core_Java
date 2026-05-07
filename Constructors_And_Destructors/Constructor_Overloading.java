package Constructors_And_Destructors;

class Constructor_Overloading {

    Constructor_Overloading() {
        System.out.println("Default Constructor");
    }

    Constructor_Overloading(int a) {
        System.out.println("Integer Constructor: " + a);
    }

    Constructor_Overloading(String name) {
        System.out.println("String Constructor: " + name);
    }

    Constructor_Overloading(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {

        Constructor_Overloading c1 = new Constructor_Overloading();

        Constructor_Overloading c2 = new Constructor_Overloading(10);

        Constructor_Overloading c3 = new Constructor_Overloading("Het");

        Constructor_Overloading c4 = new Constructor_Overloading(5, 7);
    }
}