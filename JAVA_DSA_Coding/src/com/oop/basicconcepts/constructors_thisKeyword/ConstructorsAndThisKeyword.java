package com.oop.basicconcepts.constructors_thisKeyword;

public class ConstructorsAndThisKeyword {

    public static void main(String[] args) {

//        Student2 suraj = new Student2();
//        System.out.println(suraj.marks);
//        System.out.println(suraj.rollNo);
//        suraj.greet();

        Student2 karar = new Student2(42,100,"Souvik");
        System.out.println(karar.rollNo);
        System.out.println(karar.name);
        karar.changeName("Souvik Karar");
        System.out.println(karar.name);
        karar.greet();

        System.out.println();

        Student2 suraj = new Student2(3, 90, "Suraj");
        System.out.println(suraj.rollNo);
        System.out.println(suraj.name);
        suraj.changeName("Sk. Suraj Ali");
        System.out.println(suraj.name);
        suraj.greet();

        System.out.println();

//      constructor which takes values from another object
        Student2 random = new Student2(suraj);
        System.out.println(random.name);
        System.out.println(random.rollNo);

        System.out.println();

//      calling a constructor from another constructor
        Student2 random2 = new Student2();
        System.out.println(random2.rollNo);
        System.out.println(random2.name);
        Student2 random3 = random2;
        random3.name = "Upol";
        System.out.println(random2.name);

    }

}

class Student2{
    int rollNo;
    float marks;
    String name;

//    Student2(){
//        this.rollNo = 10;
//        this.marks = 98;
//        this.name = "Souvik";
//    }

//    constructor overloading
    Student2(int rollNo, float marks, String name){
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

//    constructor which takes values from another object
//    in this particular case, "this" is random and "other" is suraj
    Student2(Student2 other){
        this.rollNo = other.rollNo;
        this.marks = other.marks;
        this.name = other.name;
    }

//    calling a constructor from another constructor
    Student2(){
        this(12,65,"Aman");
    }

    void greet(){
        //both are same
//        System.out.println("Hello "+name);
        System.out.println("Hello "+this.name);
    }

    void changeName(String name){
        this.name = name;
    }

}
