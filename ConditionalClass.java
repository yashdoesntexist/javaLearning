package javaLearning;

import java.util.*;

public class ConditionalClass {
    public static void main(String[] args) {
        // if-else statements
        Scanner scanData = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = scanData.nextInt();
        // if(age<18){
        //     System.out.println("You are not an adult");
        // }else{
        //     System.out.println("You are an adult");
        // }
        // // odd-even
        // int a = scanData.nextInt();
        // if(a%2 == 0){
        //     System.out.print(a);
        //     System.out.print(" is an even number");
        // }else{
        //     System.out.print(a);
        //     System.out.print(" is an odd number");
        // }
        // System.out.println("Enter a new number");
        // int numberOne = scanData.nextInt();
        // System.out.println("Enter your second Number");
        // int numberTwo = scanData.nextInt();
        // if(numberOne == numberTwo){
        //     System.out.println("Numbers are equal");
        // } else if(numberOne> numberTwo){
        //     System.out.println("number one is greater");

        // }else{
        //     System.out.println("number two is greater");
        // }
        // Switch Statements
        int button = scanData.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Namaste");
                break;
            case 3: System.out.println("Bonjour");
                break;
            default: System.out.println("Please pick between 1-3");
                break;
        }
    }
}
