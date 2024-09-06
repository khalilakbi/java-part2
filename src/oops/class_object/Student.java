package oops.class_object;

public class Student {

    String name;
    int id;

//    public Student(){
//
//    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void write() {
        System.out.println("is writing");
    }

    public void read() {
        System.out.println("is reading");
    }

//    public static void main(String[] args) {
//        Student student1 = new Student();//reference variable
//        student1.id = 1;
//        student1.write();
//    }


}
