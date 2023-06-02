package com.basics;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int i=1;
        int min;
        int hcf = 0;
        int prod = 1;
        int lcm = 0;
        min = Math.min(num1, num2);
        while(i<=min){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
            i++;
        }
        prod = num2*num1;
        lcm = prod/hcf;
        System.out.println("HCF is: "+hcf);
        System.out.println("LCM is: "+lcm);
    }
}
