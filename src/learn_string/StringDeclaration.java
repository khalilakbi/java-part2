package learn_string;

public class StringDeclaration {
    public static void main(String[] args) {
        // literal
        String str = "hello";

        String str2 = "student";
        //don't use this
//        String str1 = new String("hello");

        // return
        int strLength = str.length();
        System.out.println(strLength);
        // concatenation

        String str3 = str + " " + str2;
        System.out.println(str3);
        String str4 = str.concat(" "+str2);
        System.out.println(str4);


    }
}
