package com.oop.basicconcepts.final_keyword;

public class FinalKeyword {

    public static void main(String[] args) {

        A obj1 = new A("suraj");
        System.out.println(obj1.str);
        obj1.str = "ali";
        System.out.println(obj1.str);
        obj1 = new A("Hello java");
        System.out.println(obj1.str);

        final A obj2 = new A("hello suraj");
        System.out.println(obj2.str);
        obj2.str = "hello world";
        System.out.println(obj2.str);

//      here we cant reinitialize the obj2 reference variable as it's a final objcet
//      obj2 = new A("hellow");

    }

}

class A{

//  in case of primitive datatype, final variables must be declared and initialized in a same line
//  and they cant be modified anywhere in the code later
    final int CONST = 12;
    String str;

    A(String str){
        this.str = str;
    }

}