package Exception_Handling;

class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            int[] arr = new int[3];

            arr[5] = 10;

            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception");

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        } catch (Exception e) {

            System.out.println("General Exception");
        }
    }
}