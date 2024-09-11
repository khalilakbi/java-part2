package learn_static;

public class StudentTest {
    public static void main(String[] args) {
        Student nassiba = new Student(1, "nassiba");
        Student soraya = new Student(2,"soaraya");

        Student.courseName = "java";
        nassiba.printInfo();
        soraya.printInfo();

        Student.changeCourse("selenium");

        //
        nassiba.printInfo();
        soraya.printInfo();



    }
}
