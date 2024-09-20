package input_output;

import java.util.Scanner;

public class LearnIO {
    public static void main(String[] args) {

        // Scanner object
        //constructor tke Scanner take one parameter System.in to read from console
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter a number");
        // declare a variable num data type double
        // using reference variables scanner to call method nextDouble
        // so our var num get value from what we enter in console
        double num = scanner.nextDouble();


//        String name = scanner.nextLine(); // to read a string
//        int n = scanner.nextInt();  // to read an int


        if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

    }
}
