package learn_static;

public class Student {
    // instance variable
    int id;
    String name;
    static String courseName;

    // constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //
    public void printInfo() {
        System.out.println(id + " " + name + "" + " " + courseName);
    }
    public static void changeCourse(String course){
        courseName = course;
    }


}
