package OOPS;

class MaximumNumber {

    int findMax(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        MaximumNumber obj = new MaximumNumber();

        int result = obj.findMax(10, 50, 30);

        System.out.println("Maximum Number: " + result);
    }
}