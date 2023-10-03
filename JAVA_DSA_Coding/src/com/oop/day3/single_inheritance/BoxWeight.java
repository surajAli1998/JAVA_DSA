package com.oop.day3.single_inheritance;

/*
Child class can access all the items inside its parent class except the private items. More over when we
create a constructor for child class, internally its calling the default constructor of the parent class
automatically.
And obviously parent class obj cant access the child class items.
Super must be the first statement of the constructor
 */

public class BoxWeight extends Box{

    //declaring the variables as private is known as data hiding, its basically for security or privacy.
    private int a;
    private int x;

    //we can make getter setter methods which will give us power to access and modify those private items.
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }


    public double w;

    public BoxWeight(){
        this.w = 7;
    }

    public BoxWeight(double w){
        super();
        this.w = w;
        this.h = 200;
        this.b = 300;
        this.l = 400;
    }

    public BoxWeight(double side, double w) {
        //super is used to initialize the parent class variables through parent constructor
        super(side);
        this.w = w;
    }

    public BoxWeight(double h, double l, double b, double w) {
        super(h, l, b);
        this.w = w;
    }


    //in this case parent class constructor will take an obj of type Box, but it can take an obj of
    //type BoxWeight also, because BoxWeight is the child class of Box class. That's why we can pass
    //an BoxWeight obj as an argument while instantiating this BoxWeight class
    //with this constructor particularly.
    public BoxWeight(Box other, double w) {
        super(other);
        this.w = w;
    }

//    In this case other obj must be of type child class only
    public BoxWeight(BoxWeight other, double w) {
        super(other);
        this.w = w;
    }

}
