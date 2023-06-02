package com.basics;

import java.util.Scanner;

public class NcRFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int fact = 1;
        int n = 1;
        int r = 1;
        int sub = (num1-num2);
        float ncr;
        for(int i=1; i<=num1; i++){
            n = n*i;
        }
        for(int i=1; i<=num2; i++){
            r = r*i;
        }
        for(int i=1; i<=sub; i++){
            fact = fact*i;
        }
        //formulating NcR formula for combination
        ncr = (float) n /(r*fact);
        System.out.println("The ncr of the numbers is: "+ncr);
    }
}
