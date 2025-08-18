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
        int a = scanData.nextInt();
        if(a%2 == 0){
            System.out.print(a);
            System.out.print(" is an even number");
        }else{
            System.out.print(a);
            System.out.print(" is an odd number");
        }
    }
}
