package OOPS;

class StaticDemo {

    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Object Count: " + count);
    }

    public static void main(String[] args) {

        new StaticDemo();
        new StaticDemo();
	        new StaticDemo();
	
	        StaticDemo.displayCount();
    }
}