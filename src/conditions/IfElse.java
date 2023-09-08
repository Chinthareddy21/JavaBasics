package conditions;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter value of x: ");
		int x = num.nextInt();
		System.out.print("Enter value of y: ");
		int y = num.nextInt();
		/*
			Execution:
				1. x and y take values from user inputs
				2. Checks if condition succeeds or not
				3. In-case if condition satisfies executes the statement
				4. In-case if condition isn't satisfies executes the else-if/else statement
		 */
		if (x < y) {
			System.out.println("x is less than y");
			System.out.println("x is not equals to y");
		} else if (x > y) {
			System.out.println("x is greater than y");
			System.out.println("x is not equals to y");
		} else {
			System.out.println("x is equals to y");
		}
		num.close();
	}
}