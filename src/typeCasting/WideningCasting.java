package typeCasting;

public class WideningCasting {
	public static void main(String[] args) {
		//Widening casting
		int a = 8;
		float b = a;
		double c = b;
		System.out.println(b);//print float 8.0
		System.out.println(c);//print double 8.0
	}
}
