package loops;

import java.util.Scanner;
/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

public class ForLoop {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x = num.nextInt();
		for (int i = 0; i<=x; i += 2)
		{
			System.out.println(i);
		}
		num.close();
		/*
			Execution:
			1. In for loop i=0 will execute
			2. In for loop i<x will execute
			3. In for loop i++ will execute
			4. Prints values from 0 with an increment by 1 until x
		*/
	}
}