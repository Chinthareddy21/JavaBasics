import java.util.Scanner;

public class ConditionalStatements {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ConditionalStatements.ifElseIf();
		ConditionalStatements.switchCase();
	}

	public static void ifElseIf() {
		System.out.print("Enter value of a: ");
		int a = scn.nextInt();
		if (a < 18 && a > 0) {
			System.out.println("you're underage");
		} else if (a > 18 && a < 60) {
			System.out.println("you're suitable");
		} else {
			System.out.println("you're elderly");
		}
	}

	public static void switchCase() {
		System.out.println("Enter your gender: ");
		String gender = scn.next().toLowerCase();
		switch (gender) {
			case "male":
				System.out.println("Go to left side for workout");
				break;
			case "female":
				System.out.println("Go to right side for workout");
				break;
			default:
				System.out.println("Enter your gender correctly");
		}
	}
}