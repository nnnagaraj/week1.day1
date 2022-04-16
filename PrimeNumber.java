package week1.day1.assignments;

import org.apache.commons.collections4.functors.IfClosure;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int a = 15;
		// Declare a boolean variable flag as false
		boolean b = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= a / 2; i++) {
			int c = a % 13;
			if (c == 0) {
				b = true;
				System.out.println("Prime");
				break;
			}
			else
				System.out.println("Not a Prime");
		
			// Divide the input with each for loop variable and check the remainder

			// Set the flag as true when there is no remainder

			// break the iterator

			// Check the flag (Provide a condition)

			// Print 'Prime' when the condition matches

			// Print 'Not a Prime' when the condition doesn't match

		}

	}
}
