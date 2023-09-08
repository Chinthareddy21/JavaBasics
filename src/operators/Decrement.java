package operators;

/**
 * Author : Bhargava reddy Chinthareddy,
 * Purpose : Learning & Interview preparation
 */

public class Decrement {
	public static void main(String[] args) {
		/*
			In pre-decrement and post-decrement value is subtracted after operation
		*/
		pre_decrement();
		post_decrement();
		decrement();
	}
	static void pre_decrement(){
		int a = 25;
		int b = 5;
		while (a>b) {
			System.out.println(a);//Output will be 25
			--a;//-1 will be done to 'a' when next used
			System.out.println(a);//Output will be 24
			break;
		}
	}
	static void post_decrement(){
		int a = 25;
		int b = 5;
		while (a > b) {
			System.out.println(a);//Output will be 25
			a--;//-1 will be done to 'a' when next used
			System.out.println(a);//Output will be 24
			break;
		}
	}
	static void decrement(){
		int a = 25;
		int b = 5;
		while (a>b){
			System.out.println(a-- + b + --a);
			/*
				a value will be 25 on a-- because -1 will be added due to previous a--
				a value in --a will be 24 and -1 will be done when giving final output
				console output = 25 + 5 + 23 = 53
			*/
			break;
		}
	}
}