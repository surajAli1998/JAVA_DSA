package com.oop.day3.multilevel_inheritance;

import com.oop.day3.single_inheritance.BoxWeight;

public class BoxPrice extends BoxWeight {

    double price;

    public BoxPrice(double price){
        this.price = price;
    }

    public BoxPrice(double side, double w, double price){
        super(side,w);
        this.price = price;
    }

    public static void main(String[] args) {
        BoxPrice bp = new BoxPrice(1500);
//        System.out.println(bp.price+" "+bp.b+" "+bp.l+" "+bp.h+" "+bp.w);

        BoxPrice bp2 = new BoxPrice(90,100,1200);
        System.out.println(bp2.price+" "+bp2.b+" "+bp2.l+" "+bp2.h+" "+bp2.w);
    }

}
