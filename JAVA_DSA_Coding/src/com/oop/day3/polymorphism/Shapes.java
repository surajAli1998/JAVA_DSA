package com.oop.day3.polymorphism;

/*
Polymorphism is the way of representing something in different ways.
Polymorphism is of 2 types->
1) static or compile time polymorphism: also known as method overloading
2) Dynamic or run time polymorphism: also known as method overriding

method overloading: in this case method names can be same. But return type or no of parameters or order of
parameters(in case of parameters having different data type) must be different. And java will determine
which method to invoke at the compile time.
 */

public class Shapes {
    void area(){
        System.out.println("This is area of Shapes");
    }
}
