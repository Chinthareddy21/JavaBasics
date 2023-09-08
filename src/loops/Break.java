package loops;

import java.util.Scanner;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

class Break {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter 1st Value: ");
		int x = num.nextInt();
		System.out.print("Enter 2nd Value: ");
		int y = num.nextInt();
		if (x>y) {
			for (int i = 0; i < x; i++) {
				if (i > y) {
					break;
				}
				System.out.println(i);
			}
			/*
                Execution:
                1. In for loop i=0 will execute
                2. In for loop i<x will execute
                3. In for loop i++ will execute
                4. Prints values from 0 with an increment by 1
                5. If condition checking & If condition satisfies
                6. Stops printing values from y onwards
            */
			int i = 0;
			while (i < x) {
				System.out.println(i);
				i++;
				if (i > y) {
					break;
				}
			}
			/*
                Execution:
                1. In for loop i=0 will execute
                2. In for loop i<x will execute
                3. In for loop i++ will execute
                4. Prints values from 0 with an increment by 1
                5. If condition checking & If condition satisfies
                6. Stops printing values from y onwards
            */
			num.close();
		}else {
			System.out.println("Please enter the value 1 that should be greater value 2");
		}
	}
}