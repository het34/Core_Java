package Basic;

public class TypeCastingDemo {

	  public static void main(String[] args) {

	        // 🔹 Implicit Casting (Widening)
	        int numInt = 100;
	        double numDouble = numInt;  // int → double (automatic)

	        System.out.println("--- Implicit Casting (Widening) ---");
	        System.out.println("Integer value: " + numInt);
	        System.out.println("Converted to Double: " + numDouble);

	        // 🔹 Explicit Casting (Narrowing)
	        double d = 99.99;
	        int i = (int) d;  // double → int (manual)

	        System.out.println("\n--- Explicit Casting (Narrowing) ---");
	        System.out.println("Double value: " + d);
	        System.out.println("Converted to Integer: " + i);

	        // 🔹 Another Example
	        char ch = 'A';
	        int ascii = ch;  // implicit

	        System.out.println("\n--- Char to Int (Implicit) ---");
	        System.out.println("Character: " + ch);
	        System.out.println("ASCII value: " + ascii);

	        int num = 66;
	        char c = (char) num;  // explicit

	        System.out.println("\n--- Int to Char (Explicit) ---");
	        System.out.println("Integer: " + num);
	        System.out.println("Character: " + c);
	    }
	
}
