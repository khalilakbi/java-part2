package exercice;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        String str = "java is programming language";
        Map<Character, Integer> dup = new HashMap<>();

//        for(int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i));
//        }
        for (int i = 0; i < str.length(); i++) {
            if (!dup.containsKey(str.charAt(i))) {
                dup.put(str.charAt(i), 1);
            } else {
                dup.put(str.charAt(i), dup.get(str.charAt(i)) + 1);
            }
        }
        System.out.println(dup);
    }
}
