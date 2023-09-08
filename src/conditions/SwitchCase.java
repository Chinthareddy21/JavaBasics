package conditions;
import java.util.Scanner;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
			
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
			
		System.out.println("Select an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
			
		System.out.print("Enter your choice (1/2/3/4): ");
		int choice = scanner.nextInt();
			
		int result;
		/*
			Execution:
				1. Num1 and Num2 takes values from user inputs
				2. System displays Operations list
				3. User enters desired Operation number or value
				4. Based on user choice, System Checks all the cases
				5. Based on the matching case, System gives Output
		 */
		switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println("Result: " + result);
			break;
			case 2:
				result = num1 - num2;
				System.out.println("Result: " + result);
			break;
			case 3:
				result = num1 * num2;
				System.out.println("Result: " + result);
			break;
			case 4:
				result = num1 / num2;
				System.out.println("Result: " + result);
			break;
		}
		
		scanner.close();
	}
}