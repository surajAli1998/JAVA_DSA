package com.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }
    static boolean isArmstrong(int num) {
        int arm = num;
        int rem;
        double sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + Math.pow(rem,3);
            num = num / 10;
        }
        return sum == arm;
    }
}
