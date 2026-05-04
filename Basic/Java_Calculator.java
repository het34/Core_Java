package Basic;

import java.util.Scanner;

public class Java_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input
		System.out.print("Enter first number: ");
		int a = sc.nextInt();

		System.out.print("Enter second number: ");
		int b = sc.nextInt();

		// Arithmetic Operations
		System.out.println("\n--- Arithmetic Operations ---");
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));

		if (b != 0) {
			System.out.println("Division: " + (a / b));
			System.out.println("Modulus: " + (a % b));
		} else {
			System.out.println("Division & Modulus: Cannot divide by zero");
		}

		// Relational Operations
		System.out.println("\n--- Relational Operations ---");
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("a <= b: " + (a <= b));

		sc.close();
	}
}
