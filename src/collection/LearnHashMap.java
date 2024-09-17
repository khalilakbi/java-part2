package collection;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        // declare hashmap
        HashMap<Integer, Character> m = new HashMap<>();
        //
        Map<Integer, String> student = new HashMap<>();
        // adding element to map
        student.put(1, "rachida");
        student.put(2, "soaraya");
        System.out.println(student);
        student.put(2, "aksil");
        student.put(3, "aksil");
        System.out.println(student);
        //get value based on key
        String name = student.get(2);
        System.out.println(name);
        // return true if key exist
        boolean isPresent = student.containsKey(3);
        System.out.println(isPresent);
        //return collection of values in map
        Collection<String> val = student.values();
        System.out.println(val);
        //return set of key in map
        Set<Integer> k = student.keySet();
        System.out.println(k);
        student.remove(3);
        System.out.println(student);


        for(Map.Entry map : student.entrySet()){
            System.out.println(map.getKey() + "    " +map.getValue());
        }




    }
}
