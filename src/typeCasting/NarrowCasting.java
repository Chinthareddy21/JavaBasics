package typeCasting;

public class NarrowCasting {
    public static void main(String[] args) {
        //Narrow casting
        double d = 3.333333333d;
        float e = (float) d;
        int f = (int) e;

        System.out.println(d);//print double 3.333333333
        System.out.println(e);//print float 3.3333333
        System.out.println(f);//print int 3
    }
}
