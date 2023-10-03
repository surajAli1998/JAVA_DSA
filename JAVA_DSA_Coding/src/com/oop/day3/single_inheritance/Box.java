package com.oop.day3.single_inheritance;

public class Box {

    public double h;
    public double l;
    public double b;

    public Box() {
        this.h = 10;
        this.l = 12;
        this.b = 15;
    }

    public Box(double side) {
        this.h = side;
        this.b = side;
        this.l = side;
    }

    public Box(double h, double l, double b) {
        this.h = h;
        this.l = l;
        this.b = b;
    }

    public Box(Box other) {
        this.h = other.h;
        this.l = other.l;
        this.b = other.b;
    }

}
