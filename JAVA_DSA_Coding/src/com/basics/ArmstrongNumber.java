package com.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int arm = num;
        int rem;
        int sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (sum == arm) {
            System.out.println("This is an armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
}
