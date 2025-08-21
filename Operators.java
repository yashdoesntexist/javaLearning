package javaLearning;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // Basic + - * % / 
        // also ==, != < > =< =>
        // post a++ or a--
        // pre ++a or --a
        //  logical operator && both needs to be true , || only one needs to be true; ! logical not
        // Binary numbers 
        // Bitwise operators = &, | , ^, ~, <<, >>
        // Bit Manipulation
        int n = 5; //0101
        int pos =2;
        int bitMash = 1<<pos; // bitmask = 0001 shifted to 0100 

        if((bitMash & n)==0){ // checking if 01(this one)00 is equal to 01(this one) 01
            System.out.println("Your bit was zero");

        }else{
            System.out.println("Your binary is 1");
        }

        int m = 5;
        int pos2 = 1;
        int bitMask2 = 1<<pos2;

        int newNum = bitMask2 | m;
        System.out.println(newNum);

        int j= 5;
        int pos3 = 2;
        int bitMask3 = 1<<pos3;
        int notBitMask3 = ~(bitMask3);


        int newNum2 = notBitMask3 & j;
        System.out.println(newNum2);

        Scanner getInfo = new Scanner(System.in);



        int i = 5;
        int pos4 = 1;
        int oper = getInfo.nextInt(); //if oper =1  update bit to 1 else bit to 0
        int bitMask4 = 1<<pos4;

        if(oper == 1){
            int newNum3 = bitMask4 | i;
            System.out.println(newNum3);
        }else{
            int newBitMask = ~(bitMask4);
            int newNum3 = newBitMask & i;
            System.out.println(newNum3);
        }


    }
}
