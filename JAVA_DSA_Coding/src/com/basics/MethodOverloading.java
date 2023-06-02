package com.basics;

public class MethodOverloading {
    //two methods cant have same name, even if they have then argument type must differ

    public static void main(String[] args) {
        fun1(20);
        fun1("suraj");
        fun1(12,34);
        fun1(12,23,4,560);
        fun1("sonu","karar");
    }

    static void fun1(int n){

    }

    static void fun1(int n1, int n2){

    }

    static void fun1(String str){

    }

    static void fun1(int ...v){

    }

    static void fun1(String ...v){

    }
}
