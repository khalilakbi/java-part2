package collection;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        //declare arrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        //declare list of integer
        List<Integer> num = new ArrayList<>();

        // declare a list of character
        List<Character> alphabet = new ArrayList<>();
        // declare list of String

        List<String> student = new ArrayList<>();
        student.add("soraya");
        //student.add(1,"aksil");
        student.add("aksil");
        student.add("nassiba");
//        System.out.println(student);
//        // get element at index
//        String elementAt2 = student.get(2);
//        System.out.println(elementAt2);
//        //set will update element at index
//        student.set(2,"rachida");
//        student.set(0,"fazia");
//        System.out.println(student);
//        //return the size of list
//        int a = student.size();
//        System.out.println(a);
//        //remove element if exist and return true
//        boolean isRemoved = student.remove("faz");
//        System.out.println(isRemoved);
//        student.remove(1);
//        System.out.println(student);
//        // return true if element present in the list
//        //boolean isPresent = student.contains("nassiba");
//        System.out.println(student.contains("nassiba"));
//        // return the index of element return -1 doesn't exist
//        int index = student.indexOf("rachida");
//        System.out.println(index);

        for (String s : student) {
            System.out.println(s);
        }

        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }

        int[] a = {1, 4, 6, 4, 3};
        List<Integer> evenNumber = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                evenNumber.add(a[i]);
            }
        }
        System.out.println(evenNumber);



    }
}