package com.oop.day2.singleton_class;

public class Main {

    public static void main(String[] args) {

        SingletonClass sc1 = SingletonClass.getInstance();
        SingletonClass sc2 = SingletonClass.getInstance();
        SingletonClass sc3 = SingletonClass.getInstance();

    }
}
