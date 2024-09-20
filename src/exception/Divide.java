package exception;

import java.io.IOException;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a number");
            int num = scanner.nextInt();
            System.out.println("please enter a second num");
            int num1 = scanner.nextInt();
            System.out.println(num / num1);
        } catch (NullPointerException nullPointerException) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a valid number");
            int num = scanner.nextInt();
            System.out.println("please enter a valid second num");
            int num1 = scanner.nextInt();
            System.out.println(num / num1);
        }finally {
            System.out.println("we are done");
        }



    }
}
