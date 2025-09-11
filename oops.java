package javaLearning;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Wrtite");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name + this.age);
    }
//    Student(){
//        System.out.println("COnstructor called");
//    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class oops {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();

//        Student s1 = new Student();
//        s1.name = "bruce";
//        s1.age = 21;
//        s1.printName();
        Student s2 = new Student("batman" ,  25);
        s2.printName();
    }
}
