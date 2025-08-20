package javaLearning;

import java.util.Scanner;

public class Strings {
    public static void printName(String userName){
        System.out.println(userName);
    }
    
    public static void main(String[] args) {
        Scanner getInfo = new Scanner(System.in);
        String name = "Tony";
        String lastName = "Sapranos";
        String fullName = name + " " + lastName;

        System.out.println(fullName);

        String getUserName = getInfo.nextLine();
        printName(getUserName);
        System.out.println(getUserName.length());

        for(int i = 0; i< fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        
        System.out.println( name.compareTo(lastName));

    getInfo.close();    
    }
    
}
