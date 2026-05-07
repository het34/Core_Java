package Classes_And_Objects;

class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Het";
        s1.age = 22;

        s1.displayDetails();
    }
}