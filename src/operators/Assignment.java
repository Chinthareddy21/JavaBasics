package operators;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

import java.util.Scanner;

public class Assignment {
	static int x;
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a Value: ");
		x = num.nextInt();

		addition();
		subtraction();
		multiplication();
		division();
		/*
			Execution:
			1. x takes value of the input from user
			2. If we do in sequence
				I.   In addition, 1 is added to x and Output will be given as a
				II.  In subtraction, 1 is subtracted from a and Output will be given as b = (a - 1)
				III. In multiplication, b is multiplied with 2 and Output will be given as c = (b * 2)
				IV.  In Division, c is divided by 2 and final output will be given (c / 2)
				V.   If value of x is below 5, a message will be displayed stating that
						"Please enter the value that is higher than 5"
				VI.  The complete code will run in sequence only if conditions of all the blocks are satisfied
			3. If we do individually
				I.   In addition, 1 is added to x and Output will be given
				II.  In subtraction, 1 is subtracted from x and Output will be given
				III. In multiplication, x is multiplied with 2 and Output will be given
				IV.  In division, x is divided by 2 and Output will be given
				V.   If condition is not satisfied a message will be displayed stating that
						"Please enter the value that is higher than 5"
				VI.  The complete code will run only if condition is satisfied
		 */
	}

	static void addition(){
		if (x>=5){
			System.out.println(x+=1);
			//Value of x will be increased by 6 in the output
		}else{
			System.out.println("Please enter the value that is higher than 5");
		}
	}

	static void subtraction(){
		if (x>=5){
			System.out.println(x-=1);
			//Value of x will be decreased by 5 in the output
		}else{
			System.out.println("Please enter the value that is higher than 5");
		}
	}

	static void multiplication(){
		if (x>=5){
			System.out.println(x*=2);
			//Value of x will be multiplied by 10 in the output
		}else{
			System.out.println("Please enter the value that is higher than 5");
		}
	}

	static void division(){
		if (x>=5){
			System.out.println(x/=2);
			//Value of x will be increased by 5 in the output
		}else{
			System.out.println("Please enter the value that is higher than 5");
		}
	}
}