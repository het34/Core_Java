package OOPS;

class MethodOverloading {

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(String name) {
        System.out.println("String: " + name);
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        mo.display(10);
        mo.display(10.5);
        mo.display("Het");
    }
}