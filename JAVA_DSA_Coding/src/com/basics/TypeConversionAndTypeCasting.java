package com.basics;

import java.beans.Expression;
import java.util.Scanner;

public class TypeConversionAndTypeCasting {
    public static void main(String[] args) {
//      automatic type conversion example
//      happens when source data type size is smaller than that of destination datatype
        Scanner input = new Scanner(System.in);
        float num1 = input.nextInt(); // here int will be automatically converted into float value
        System.out.println("num1 is: "+num1);

//      type casting example
        int num2 = (int)(34.45f); //here float value is explicitly converted into int value.
        System.out.println("num2 is: "+num2);

        int num3 = 259;
//      byte can store max till 256, so if we put more than that then it will store the modulo value
//      like num3%256, and it will be 3 that's why output will be 3
        byte b1 = (byte)(num3);
        System.out.println("b1 is: "+b1);

        int num4 = 'A';
//      char A will be converted into its ASCII value and store it as an int
        System.out.println("num4 is: "+num4);
        char c1 = 65;
        System.out.println("c1 is: "+c1);

//      Automatic Type Promotion In Expression
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c;

        byte b2 = 50;
//      (50*3) expression is being evaluated as int that's why we have to explicilty convert it into byte
//      in order to asign it into b2 which is byte
        b2 = (byte)(50*3);

        byte b3 = 42;
        char c2 = 'a';
        short s = 1000;
        int i = 50000;
        float f = 3.65f;
        double d1 = 0.1234;
        double result = (f*b3) + (i/c2) + (d1*s);
        System.out.println((f*b3)+"  " +(i/c2)+"  " +(d1*s));
//      In the whole expression, double is the highest type and that's why total evaluation is being
//      promoted to double
        System.out.println("result is: "+result);

    }
}
