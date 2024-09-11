package learn_converstion;

public class Conversion {
    public static void main(String[] args) {
        // string to int

        String str = "190";
        int i = Integer.parseInt(str);
        System.out.println(i);

        // int to string
        int a = 170;
        String str1 = String.valueOf(a);
        System.out.println(str1);

        // string to double

        String str2 = "12.67";
        double d = Double.parseDouble(str2);
        System.out.println(d);

        // string to boolean

        String str3 = "truE";
        boolean isFalse = Boolean.parseBoolean(str3);
        System.out.println(isFalse);


    }
}
