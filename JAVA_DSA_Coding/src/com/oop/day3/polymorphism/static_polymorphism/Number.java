package com.oop.day3.polymorphism.static_polymorphism;

/*
Polymorphism is the way of representing something in different ways.
Polymorphism is of 2 types->
1) static or compile time polymorphism: also known as method overloading
2) Dynamic or run time polymorphism: also known as method overriding

method overloading: in this case method names can be same. But return type or no of parameters or order of
parameters (in case of parameters having different data type) must be different. And java will determine which method
to invoke at the compile time.
 */
public class Number {
    int number(int a, int b){
        return a+b;
    }
    int number(int a ){
        return a;
    }
    double number(double b, int a){
        return b+a;
    }
    double number(int a, double b){
        return b+a;
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.number(5,6);
        n.number(23);
        n.number(23.25,12);
        n.number(12,56.23);
    }
}
