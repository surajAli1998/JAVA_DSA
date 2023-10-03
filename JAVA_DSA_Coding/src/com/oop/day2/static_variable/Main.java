package com.oop.day2.static_variable;

public class Main {

    public static void main(String[] args) {

        Human suraj = new Human(25,"suraj",27000,false);
        Human karar = new Human(24,"karar",30000,false);

        System.out.println(Human.population);

//      we cant call a non-static element from a static entity
//      greet();

//      below both method invoking style are fine, as invoke is a static method
        Main.invoke();
        invoke();

        Human.message();

    }

    static void invoke(){

//      as invoke method is a static context so we cant invoke a non static method from static context
//      greet()

//      we have to invoke non static greet method by creating an object of Main class because its non static.
//      Hence creating an obj of class Main and then accessing greet()
        Main m = new Main();
        m.greet();
        m.fun();

    }

    void fun(){

//      Here we can call non-static greet from non-static fun method because at the end both need a obj
        greet();

    }

    void greet(){

        System.out.println("Hello good morning");

    }

}
