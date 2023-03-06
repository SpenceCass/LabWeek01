//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int seatsAvailable = 33;


		// 2. Create a variable to hold the cost of groceries at checkout
double costTotal = 67.75;


		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'C';


		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean isHotOutside = true;
boolean isColdOutside = false;


		// 5. Create a variable to hold a customer's first name
String firstName = "Zachary";


		// 6. Create a variable to hold a street address
String streetAddress = "891 Briarwood Ct";		


		// 7. Print all variables to the console
System.out.println(seatsAvailable);	
System.out.println(costTotal);
System.out.println(middleInitial);
System.out.println(isHotOutside);
System.out.println(isColdOutside);
System.out.println(firstName);
System.out.println(streetAddress);


		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
int seatsBooked = 2;
seatsAvailable = seatsAvailable - seatsBooked;
System.out.println(seatsAvailable);


		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
double candyBar = 2.15;
costTotal = costTotal + candyBar;
System.out.println(costTotal);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
middleInitial = 'D';
System.out.println(middleInitial);


		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
isHotOutside = false;
System.out.println(isHotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
String lastName = "Doe";
String fullName = firstName + " " + middleInitial + "." + " " + lastName;
System.out.println(fullName);


		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
System.out.println("The customer's name is " + fullName + " " + "and his address is " + streetAddress + ".");
		
		
	}
}