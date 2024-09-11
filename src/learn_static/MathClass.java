package learn_static;

import java.util.Arrays;

public class MathClass {
    public static void main(String[] args) {
        // math class contain only static methods
        int min = Math.min(4, 8);
        double d = Math.sqrt(16);
        System.out.println(d);
        // arrays contain static methods that help us manipulate array
        int a[] = {3, 7, 6, 8, 1};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
