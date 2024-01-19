import java.util.Scanner;

public class Loops {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Loops.WhileLoop();
		Loops.forLoop();
	}

	public static void WhileLoop() {
		System.out.print("Enter value of a: ");
		int a = scn.nextInt();
		int end = 100;
		while (a >= 0 && a <= end) {
			System.out.print(a);
			if (a < end) {
				System.out.print(", ");
			}
			a++;
		}
		System.out.println();
	}

	public static void forLoop() {
		System.out.print("Enter value of b: ");
		for (int b = scn.nextInt(); b <= 100; b = b + 5) {
			System.out.println(b);
		}
	}
}