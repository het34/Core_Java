package Control_Flow_Statements;

import java.util.Scanner;

public class Fibonacci_Series {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Please enter any number");
	int n = scn.nextInt();
	
	int prev = 0;
	int next = 1;
	for(int i = 1; i <= n-1; i++) {
		int nextCurr = next;
		next += prev;
		prev = nextCurr;
	}
	
	System.out.println("The sum of series is :" + next);
}
}
