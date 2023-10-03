package com.oop.day3.single_inheritance;

import com.oop.day3.multilevel_inheritance.BoxPrice;

public class Main {
    public static void main(String[] args) {
        Box mainBox1 = new Box();
        System.out.println(mainBox1.b+" "+mainBox1.l+" "+mainBox1.h);

        Box mainBox2 = new Box(25);
        System.out.println(mainBox2.b+" "+mainBox2.l+" "+mainBox2.h);

        Box mainBox3 = new Box(mainBox2);
        System.out.println(mainBox3.b+" "+mainBox3.l+" "+mainBox3.h);

        Box mainBox4 = new Box(1,1,1);
        System.out.println(mainBox4.b+" "+mainBox4.l+" "+mainBox4.h);

        BoxWeight childBox1 = new BoxWeight();
        System.out.println(childBox1.w);
        System.out.println(childBox1.h);

        BoxWeight childBox2 = new BoxWeight(5);
        System.out.println(childBox2.w+" "+childBox2.b+" "+childBox2.l+" "+childBox2.h);

        BoxWeight childBox3 = new BoxWeight(50,50);
        System.out.println(childBox3.w+" "+childBox3.b+" "+childBox3.l+" "+childBox3.h);

        BoxWeight childBox4 = new BoxWeight(60,65,70,80);
        System.out.println(childBox4.w+" "+childBox4.b+" "+childBox4.l+" "+childBox4.h);


        BoxWeight childBox6 = new BoxWeight(mainBox4,12);
        System.out.println(childBox6.w);

        BoxWeight childBox5 = new BoxWeight(childBox3,45);
        System.out.println(childBox5.w+" "+childBox5.b+" "+childBox5.l+" "+childBox5.h);

        /*
        In this case even though obj is created of class BoxWeight, we cant access w. Because by the rule
        b1 obj is referenced by parent class which is Box, so it will have only access to the Box items.
         */
//        Box b1 = new BoxWeight(8,8,8,8);
//        System.out.println(b1.w);

        /*
        We cant do like below. According to the rule b2 will have access to the items which comes under
        the class of referencing type. In this case its BoxWeight class. So b2 should have access to w.
        But the thing is obj is created of type Box, and due to that it's only calling the parent class
        constructor not the child class constructor present inside BoxWeight class. That's why it's not
        possible for an obj of parent class to be referenced by child class.
         */
        // BoxWeight b2 = new Box(6,6,6);


        //so like this we can access and use private data with the help of getter setter methods
        childBox2.setA(63);
        childBox2.setX(73);
        System.out.println(childBox2.getA()+" "+childBox2.getX());

    }
}
