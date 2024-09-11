package WrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        // declare object Integer
        Integer i = 1;
        int a = i; // convert object to primitive int
        System.out.println(a);

        int myInt = 90;
        Integer myInteger = myInt;// convert from primitive to object

        char c = 'f';
        Character character = c;// convert primitive char to object Character

        Character ch = 'y';
        char s = ch;// covert object to primitive

        boolean isTrue = true;
        Boolean b = isTrue;

        Boolean r = false;
        boolean e = r;// convert object tp primitive
    }
}
