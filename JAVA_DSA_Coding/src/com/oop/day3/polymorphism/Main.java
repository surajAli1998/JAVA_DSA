package com.oop.day3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle c1 = new Circle();
        Square sq1 = new Square();
        s1.area();
        c1.area();
        sq1.area();
        Shapes s2 = new Square();
        s2.area();
    }
}
