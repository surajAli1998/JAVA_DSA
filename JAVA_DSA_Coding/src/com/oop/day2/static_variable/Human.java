package com.oop.day2.static_variable;

/*
static variables can be accessed and modified without the objects of a class being created. That means static
variable are independent of any object. We can access them with the class name like this-> ClassName.static_var
These static variables are available to all the objects of the class.
 */

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){

        System.out.println("This is static method under Human class");

    }

    public Human(int age, String name, int salary, boolean married) {

        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

//      initializing static variable with the help of class name
        Human.population = 500000000;

//      similarly invoking static method with class name Human
        Human.message();

    }

}
