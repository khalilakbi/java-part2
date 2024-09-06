package oops.polymorphism;

public class Calculator {

    public int add(int a, int b){
        return a + b;// method body
    }
    public int add(int a, int b, int c){
        return a + b + c ;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,6);

    }
}
