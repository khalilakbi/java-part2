package oops.class_object;

public class Arithmetic {
    // var
    int a;
    int b;

    // constructor
    // cant be abstract final static
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // methods

    public int addition() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }


}
