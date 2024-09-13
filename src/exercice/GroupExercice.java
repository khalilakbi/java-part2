package exercice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupExercice {
    public static void main(String[] args) {
        List<String> student = new ArrayList<>();
        student.add("soraya");
        student.add("nassiba");
        student.add("rachida");
        student.add("aksil");
        student.add("fazi");
        for (String s : student) {
            if (s.endsWith("a")) {
                System.out.println(s);
            }
        }


        int a[] = {1, 4, 5, 1, 4, 5, 6, 7, 9};
        Set<Integer> noDuplicate = new HashSet<>();
        for (int i : a) {
            noDuplicate.add(i);
        }
        System.out.println(noDuplicate);


    }
}
