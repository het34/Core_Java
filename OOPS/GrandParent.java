package OOPS;

class GrandParent {

    void showGrandParent() {
        System.out.println("GrandParent Class");
    }
}

class Parent2 extends GrandParent {

    void showParent() {
        System.out.println("Parent Class");
    }
}

class Child2 extends Parent2 {

    void showChild() {
        System.out.println("Child Class");
    }

    public static void main(String[] args) {

        Child2 c = new Child2();

        c.showGrandParent();
        c.showParent();
        c.showChild();
    }
}