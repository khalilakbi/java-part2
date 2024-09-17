package input_output;

import java.util.Scanner;

public class LearnIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.nextLine();
        if(name.startsWith("a")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


//        System.out.println("enter a number");
//        double num = scanner.nextDouble();
//
//
//        if(num > 0){
//            System.out.println("positive");
//        }else {
//            System.out.println("negative");
//        }

    }
}
