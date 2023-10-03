package com.oop.day3.polymorphism.dynamic_polymorphism;

public class Automobile {
    void milage(){
        System.out.println("This is milage of an automobile");
    }

    /*
    final methods cant be overridden. in normal overriding java will decide which method to call in run time,
    that's why uts also called late binding.
    But in case of final method, as it cant be overridden further so in compile time itself java is calling the
    final method only, this is called early binding.
     */
    final void clutch(){
        System.out.println("Clutch is a mandatory part");
    }


    /*
    we cant override a static method. static methods are independent of objects and overriding concept is purely
    based on objects, so static cant be overridden. when ever we try to call it via class or obj name it will call
    base class or main class method.
     */
    static void gearBox(){
        System.out.println("All vehicle has gear box");
    }
}
