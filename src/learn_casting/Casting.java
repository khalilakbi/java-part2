package learn_casting;

public class Casting {
    public static void main(String[] args) {
        // smaller to larger
        int myInt = 16;
        double myDouble = myInt;

        System.out.println(myDouble);

        // larger to smaller
        double d = 1234.67d;
        int i = (int) d;


        double x = 123d;
        long l = (long) x;
//
    }
}
