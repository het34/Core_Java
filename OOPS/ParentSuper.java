package OOPS;

class ParentSuper {

	ParentSuper() {
        System.out.println("Parent Constructor");
    }

    void show() {
        System.out.println("Parent Method");
    }
}

class Child1 extends ParentSuper {

    Child1() {
        super();
        System.out.println("Child Constructor");
    }

    void display() {
        super.show();
        System.out.println("Child Method");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}