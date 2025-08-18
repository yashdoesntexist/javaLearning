package javaLearning;

import java.util.*;

public class FunctionClass {
    public static int factorialFunc(int a){
        if(a<0){
            System.out.println("invalid");
            return 0;
        }
        int factorial = 1;
        for(int i =a; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void printName(String name){
        System.out.println("Your name is "+ name);
        return;
    }
    public static int sumNum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        // starting functions
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter your name");
        String givenName = getInput.nextLine();
        printName(givenName);
        // sumNum(9, 9 );
        System.out.println(sumNum(9, 9));
        System.out.println(factorialFunc(-8));
    }
}
