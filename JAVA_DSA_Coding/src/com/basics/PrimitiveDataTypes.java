package com.basics;

import java.util.Scanner;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please neter ur roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Roll number is: "+rollNo);

        System.out.println("Please ur section: ");
        char section = input.next().charAt(0);
        System.out.println("Your section is: "+section);

        System.out.println("Please enter the price: ");
        float price = input.nextFloat();
        System.out.println("Price is: "+price);

        System.out.println("Please enter a long integer value: ");
        long longInteger = input.nextLong();
        System.out.println("Price is: "+longInteger);

        System.out.println("Please enter a long decimal value: ");
        double longDecimal = input.nextDouble();
        System.out.println("Price is: "+longDecimal);
    }
}






