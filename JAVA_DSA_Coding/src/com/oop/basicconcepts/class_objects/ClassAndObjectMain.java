package com.oop.basicconcepts.class_objects;

public class ClassAndObjectMain {

    public static void main(String[] args) {

        //object declaration
        //Student class is being instantiated and suraj is the object of class type student
        //with the help of suraj we can initialize and access instance variables like below
        Student suraj = new Student();

        //these values are entirely related to suraj object
        suraj.marks = 93f;
        suraj.name = "Sk. Suraj Ali";
        System.out.println(suraj.marks);
        System.out.println(suraj.name);
        //if we dont initialize a instance variable then its gonna take default value
        System.out.println(suraj.rollNo);

        Student karar = new Student();
//        karar.name = "Souvik Karar";
        //this time it will give default value of name which is null, as its not initialized for obj karar
        System.out.println(karar.name);
        System.out.println(karar.rollNo);

    }

}

//class is template or a custom data type contains variables and methods
class Student{
    int rollNo = 3;
    float marks;
    String name;
}
