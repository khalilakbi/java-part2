package collection;

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        //declare hashmap where key Integer and value are String
        Map<Integer, String> student = new HashMap<>();

        // adding element to map duplicate  key are not allowed
        // we can have duplicate value
        student.put(1, "rachida");
        student.put(2, "soaraya");
        System.out.println(student);
        student.put(2, "aksil");
        student.put(3, "aksil");
        System.out.println(student);

        //get() return value based on key
        String name = student.get(2);
        System.out.println(name);
        // containsKey() return true if key exist
        boolean isPresent = student.containsKey(3);
        System.out.println(isPresent);
        //values() return collection view of values
        Collection<String> val = student.values();
        System.out.println(val);
        //keySet() return set of key
        Set<Integer> k = student.keySet();
        System.out.println(k);
        // remove() remove element from map
        student.remove(3);
        System.out.println(student);

        // using for-each loop for iteration over Map
        for (Map.Entry map : student.entrySet()) {
            System.out.println(map.getKey() + "    " + map.getValue());
        }

    }
}
