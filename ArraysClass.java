package javaLearning;

import java.util.*;


public class ArraysClass {
    public static void main(String[] args) {
        // one way to declare array

        // int[] studentGrades1 = new int[3];
        // studentGrades1[0] = 97;
        // studentGrades1[1] = 90;
        // studentGrades1[2] = 93;

        //  System.out.println(studentGrades1[0]);
        //  System.out.println(studentGrades1[1]);
        //  System.out.println(studentGrades1[2]);

        // int[] studentGrades2 = {97,99,90}; // other way to define it
        
        // for(int i = 0; i<3; i++){
        //     System.out.println(studentGrades2[i]);
        // }

        // Scanner getGrades = new Scanner(System.in);
        // int size = getGrades.nextInt();
        // int[] studentGrades3 = new int[size];
        
        // for(int i = 0; i<size; i++){
        //     studentGrades3[i] = getGrades.nextInt();
        // }

        // for(int i = 0; i<size; i++){
        //     System.out.println(studentGrades3[i]);
        // }

        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = getInput.nextInt();
        int[] userArray = new int[size];

        System.out.println("Ener the element of arrays");
        for(int i = 0; i < size; i++){
            userArray[i] = getInput.nextInt();
        }

        System.out.println("Enter the number to find in array");
        int searchNumber = getInput.nextInt();

        for(int i = 0; i< userArray.length; i++){ // linear search 
            if(userArray[i] == searchNumber){
                System.out.println(i);
            }
        }

        
    }
}
