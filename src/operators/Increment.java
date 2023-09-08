package operators;

public class Increment {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        /*
			In pre-increment increment value is added before operation
			and in post-increment value is added after operation
		*/
        //Pre-increment
        while (a>b){
            System.out.println(a);
            //Prints up to 25 because increment should not be more than the variable
            ++a;
            break;
        }
        //Post-increment
        while (a>b){
            System.out.println(a);
            //Prints up to 26 because increment can be more than the variable
            a++;
            break;
        }
    }
}
