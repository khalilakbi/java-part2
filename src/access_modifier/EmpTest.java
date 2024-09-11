package access_modifier;

import java.util.Arrays;

public class EmpTest {
    public static void main(String[] args) {
        String str = "java is a programing language";





    }

    static String reverseWord(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev =  str.charAt(i) + rev;
        }
        return rev;
    }
}
