package oops.encapsulation;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();

        student.setDob("12/34/67");
        System.out.println(student.getDob());
    }
}
