package javaLearning;

import java.util.Scanner;

public class Strings {
    public static void printName(String userName){
        System.out.println(userName);
    }
    
    public static void main(String[] args) {
        Scanner getInfo = new Scanner(System.in);
        // String name = "Tony";
        // String lastName = "Sapranos";
        // String fullName = name + " " + lastName;

        // System.out.println(fullName);

        // String getUserName = getInfo.nextLine();
        // printName(getUserName);
        // System.out.println(getUserName.length());

        // for(int i = 0; i< fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }
        
        // String name1 = "Tony";
        // String name2 = "Sony";

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("Not equal");
        // }

        // String sentence = "This is a huge statement I just want the name and it is Bruce Wayne";
        // String justName = sentence.substring(56, sentence.length());
        // System.out.println(justName);
        StringBuilder newName = new StringBuilder("AJ Saprano");
        System.out.println(newName);
        System.out.println(newName.length());
        System.out.println(newName.charAt(0));
        newName.setCharAt(0, 'T');
        System.out.println(newName);
        newName.insert(0, 'S');
        System.out.println(newName);
        newName.delete(0, 1);
        System.out.println(newName);
        newName.append("s");
        System.out.println(newName);

        for(int i = 0; i<newName.length()/2; i++){
            int front = i;
            int back = newName.length() -1 -i;

            char frontChar = newName.charAt(front);
            char backChar = newName.charAt(back);

            newName.setCharAt(front, backChar);
            newName.setCharAt(back, frontChar);

        }
        System.out.println(newName);

    getInfo.close();    
    }
    
}
