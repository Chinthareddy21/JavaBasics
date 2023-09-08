package loops;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

public class WhileLoop {
	public static void main(String[] args) {
		int x = 5;
		int y = 12;
		while(x < y){
			System.out.println(x);
			x++;
		}
		/*
			Execution:
				1. System checks the condition in the while loop
				2. If the condition satisfies system prints value of x
				   until value of y with +1 increment
		 */
	}
}