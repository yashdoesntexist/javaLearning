package javaLearning;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanData = new Scanner(System.in);
        System.out.println("Enter the number for calculation");
        int numberOne = scanData.nextInt();
        System.out.println("Enter the second number for calculation");
        int numberTwo = scanData.nextInt();
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for dividing");
        int option = scanData.nextInt();
        switch (option) {
            case 1: System.out.println(numberOne+numberTwo);
                break;
            case 2: System.out.println(numberOne-numberTwo);
                break;
            case 3: System.out.println(numberOne*numberTwo);
                break;
            case 4: System.out.println(numberOne/numberTwo);
                break;
            case 0: System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for dividing");
                break;
            default:System.out.println("Syntax press 0 to see all the options to calculate");
                break;
        }

    }
}
