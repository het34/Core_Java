package Control_Flow_Statements;

public class FactorialNumber {
public static void main(String[] args) {
	
	int fact = 5;
	for(int i = fact - 1; i >= 1; i--) {
			fact = fact * i;
	}
	
	System.out.println("Factorial of 5 is : " + fact);
}
}
