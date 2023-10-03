package com.oop.day3.polymorphism.dynamic_polymorphism;

public class Bike extends Automobile{

    /*
    @Override annotation denotes a particular method is overriding its superclass method.
    We cant use this annotation in case of new methods which dosen't override.
     */
    @Override
    void milage(){
        int a = 65;
        System.out.println(a);
    }


//    @Override
    void engine(){
        System.out.println("125cc engine");
    }


//    @Override
//    void clutch(){
//        System.out.println("final method cant be overridden");
//    }


//    @Override
    static void gearBox(){
        System.out.println("this is child class gearBox method");
    }

}
