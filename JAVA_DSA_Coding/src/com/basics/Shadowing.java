package com.basics;

public class Shadowing {
    static int n = 10;

    public static void main(String[] args) {
        System.out.println(n);

        /*
        n declared under class is having higher level scope than the n declared inside this main method.
        Due to this reason shadowing happens. and that's why the above class level n is being shadowed by
        below method level n and hence sout of this main method will give output as 20
         */
        int n = 20;
        System.out.println(n);
        fun();
    }
    static void fun(){
        /*
        But here n is considered the class level n=10 becoz n=20 is only local to main method
         */
        System.out.println(n);
    }

}
