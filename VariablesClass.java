package javaLearning;

import java.util.*;

public class VariablesClass {
    public static void main(String[] args) {
        //Variables
        // Primitive- byte(1byte), short, char(2 byte), boolean(1byte), int(4), long(8), float(4), double(8)
        // Non-primitive - String, Array, Class, object, interface
        int a = 25;
        int b = 10;
        int sum = a+b;
        System.out.println(sum);
        System.out.println(a*b);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextInt for number
        // nextFLoat for decimal number
        System.out.println(name);
        Scanner createSum = new Scanner(System.in);
        System.out.println("Enter the first number to add");
        int c = createSum.nextInt();
        System.out.println("Enter the second number to add");
        int d = createSum.nextInt();
        System.out.print("Your sum is ");
        System.out.println(c*d);
        

    }
}
