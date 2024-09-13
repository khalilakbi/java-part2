package collection;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        // declare hashset
        Set<Integer> numbers = new HashSet<>();
        // set duplicate element not allowed
        // doesn't maintain insertion order
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        System.out.println(numbers);


        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
