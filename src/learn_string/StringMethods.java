package learn_string;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  soraya ";
        String str2 = "soraya";
        String str3 = " ";
        //chartAt return character at index
        char c = str.charAt(4);
        System.out.println(c);

        //substring return string from index
        String strSubstring = str.substring(2);
        System.out.println(strSubstring);

        //substring return string from index to index
        String subString2 = str.substring(1, 4);
        System.out.println(subString2);

        //compare two string
        boolean isEqual = str.equals(str2);
        System.out.println(isEqual);

        //return true if string empty
        boolean isEmpty = str3.isEmpty();
        System.out.println(isEmpty);
        // convert lower case to upper case
        String toUpper = str.toUpperCase();
        System.out.println(toUpper);
        // delete white space from the beginning and the end
        System.out.println(str.length());
        String trim = str.trim();
        System.out.println(trim.length());

        //split string based on a regular expression
        String sentence = "this@is@a@java@course";

        String word[] = sentence.split("@");
        // for each element in word
        for (String element : word) {
            System.out.println(element);
        }
        // return true if string contain substring
        boolean isContain = str.contains("so");
        System.out.println(isContain);


    }
}
