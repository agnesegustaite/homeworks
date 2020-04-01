package homeWorks;

import java.util.Scanner;

public class ChangeCalculator {
	public static void main(String[] args){

		 int price, received, change, pay50, pay20, pay10, pay5, pay2, pay1;

	        Scanner input;
	        input = new Scanner(System.in);

	        System.out.println("Enter total price of your product");
	        price = input.nextInt();

	        System.out.println("Enter amount you gave to:");
	        received = input.nextInt();

	        change = received - price; // 38

	        System.out.println("Give to the customer " + change + " EUR");

	      	// Calculate remainder
	        pay50 = (change % 50); 	// 38 % 50 = 38
	        pay20 = (pay50 % 20); 	// 38 % 20 = 18 After giving 20 note, 18 is remainder
	        pay10 = (pay20 % 10); 	// 18 % 10 = 8  After giving 10 note, 8 is remainder
	        pay5 = (pay10 % 5); 		// 8 % 5 = 3    After giving 5 note, 3 is remainder 
	        pay2 = (pay5 % 2); 			// 3 % 2 = 1    After giving 3 coin, 1 is remainder
	        pay1 = (pay2 % 1);		  // 1 % 1 = 0		After giving 1 coin, 0 is remainder
	      
	      	// Calculate notes/coins
	        pay1 = (pay2 - pay1) / 1; // 1
	        pay2 = (pay5 - pay2) / 2; // 1
	        pay5 = (pay10 - pay5) / 5; // 1
	        pay10 = (pay20 - pay10) / 10; // 1
	        pay20 = (pay50 - pay20) / 20; // 1
	        pay50 = (change - pay50) / 50; // 0

	        System.out.println("The customer should be given:");
	        System.out.println(pay50 + " fifty euro note(s)");
	        System.out.println(pay20 + " twenty euro note(s)");
	        System.out.println(pay10 + " ten euro note(s)");
	        System.out.println(pay5 + " five euro note(s)");
	        System.out.println(pay2 + " two euro note(s)");
	        System.out.println(pay1 + " one euro note(s)");
	        
	    }
	}


	//and outprint should be:
	// Enter total price of your product:
	// 12

	// Enter amount you gave to:
	// 50

	// Customer should received back 38 EUR

	// 50 EUR notes: 0
	// 20 EUR notes: 1
	// =================================
	// The customer should be given:
	// 0 fifty euro note(s)
	// 1 twenty euro note(s)
	// 1 ten euro note(s)
	// 1 five euro note(s)
	// 1 two euro coin(s)
	// 1 one euro coin(s)
	//