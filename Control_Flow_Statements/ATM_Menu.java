package Control_Flow_Statements;

import java.util.Scanner;

public class ATM_Menu {
public static void main(String[] args) {
	System.out.println("Please Choose Any Option");
	
	System.out.println("Check Balance => Press 1");
	System.out.println("Check Deposit => Press 2");
	System.out.println("Check Withdraw => Press 3");
	
	Scanner scn = new Scanner(System.in);
	int opt = scn.nextInt();
	
	switch (opt) {
	case 1:
		System.out.println("Your Balance is $500000");
		break;
	case 2:
		System.out.println("Your Diposit Ammount is $3000");
		break;
	case 3:
		System.out.println("Your money is withdrawn");
		break;
	default:
		System.out.println("Invalid Option is Selected");
		break;
	}
}
}
