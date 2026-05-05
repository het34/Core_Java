package Control_Flow_Statements;

import java.util.Scanner;

public class Odd_Even_Program {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 2; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is an even number");
			}else {
				System.out.println(i + " is an odd number");
			}
		}
		
	}
	
}