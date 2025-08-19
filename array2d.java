package javaLearning;

import java.util.*;

public class array2d {
    public static void main(String args[]){
        Scanner getInfo = new Scanner(System.in);
        int[][] testingArray = new int[3][5];
        testingArray[0][0] = 2;
        testingArray[0][1] = 2;
        testingArray[0][2] = 2;
        testingArray[2][1] = 2;
        testingArray[0][4] = 2;
        testingArray[1][1] = 2;
        testingArray[1][0] = 2;
        testingArray[2][0] = 2;
        testingArray[2][2] = 2;

        for(int i = 0; i<6; i++){
            for(int j = 0; j<4; j++){
                System.out.print(testingArray[i][j]);
            }
            System.out.println();
        }

        int rows = getInfo.nextInt();
        int cols = getInfo.nextInt();

        int[][] userArray = new int[rows][cols];

        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                userArray[i][j] = getInfo.nextInt();
            }
        }

        System.out.println(" Your 2D array is:");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(userArray[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Enter the number to get the index for that number");

        int findNum = getInfo.nextInt();

        for(int i = 0; i< rows; i++){
            for(int j= 0; j<cols ; j++){
                if ((userArray[i][j] == findNum )) {
                    System.out.println("Your number is stored at: " + i + " , " +j);
                    
                }
            }
        }


    }
}
