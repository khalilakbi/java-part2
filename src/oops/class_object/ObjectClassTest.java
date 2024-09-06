package oops.class_object;

public class ObjectClassTest {
    public static void main(String[] args) {


        Student aksil = new Student(123, "aksil");
        Student nassiba = new Student(213, "nassiba");

        Arithmetic arithmetic = new Arithmetic(5, 8);

        int add = arithmetic.addition();
        System.out.println(add);


    }
}
