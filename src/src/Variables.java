import java.util.Scanner;

public class Variables {
	public static Scanner scn = new Scanner(System.in);
	public static String name;
	public static char genderType;
	public static int yourAge;
	public static float yourWeight;
	public static double yourHeight;

	public static void main(String[] args) {
		Variables.enterName();
		Variables.age();
		Variables.gender();
		Variables.height();
		Variables.weight();
		Variables.form();
	}

	public static void enterName(){
		System.out.print("Enter your Name: ");
		name = scn.next();
	}

	public static void gender(){
		System.out.print("Enter your gender: ");
		genderType = scn.next().charAt(0);
	}

	public static void age(){
		System.out.print("Enter your age: ");
		yourAge = scn.nextInt();
	}

	public static void height(){
		System.out.print("Enter your height: ");
		yourHeight = scn.nextDouble();
	}

	public static void weight(){
		System.out.print("Enter your weight: ");
		yourWeight = scn.nextFloat();
	}

	public static void form(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + yourAge);
		System.out.println("Gender: " + genderType);
		System.out.println("Height: " + yourHeight);
		System.out.println("Weight: " + yourWeight);
	}
}