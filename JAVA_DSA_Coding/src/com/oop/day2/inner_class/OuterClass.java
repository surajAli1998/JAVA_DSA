package com.oop.day2.inner_class;

public class OuterClass {

//  InnerClass must be static
//    class InnerClass1{
//
//    }

    static class InnerClass{

        String name;

        public InnerClass(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {

//      We cannot do like this because InnerClss is a non-static class inside OuterClass which makes it
//      dependent on the objects of OuterClass, so we cant instantiate it from a static context like main
//      method;
//      InnerClass1 ic =  new InnerClass1();
//
        InnerClass ic1 =  new InnerClass("Suraj");
        InnerClass ic2 =  new InnerClass("Nafisha");
        System.out.println(ic1.name);
        System.out.println(ic2.name);

    }

}
