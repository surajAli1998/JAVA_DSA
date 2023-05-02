package com.basics;

import java.util.Scanner;

public class SumOfTwoValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 values to add: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of these 2 given values are: "+sum);
    }
}

