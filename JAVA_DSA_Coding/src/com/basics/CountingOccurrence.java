package com.basics;

import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the digit to check the occurence: ");
        int dig = sc.nextInt();
        int rem;
        int count = 0;
        boolean flag = false;
        while(num > 0){
            rem = num%10;
            if(dig==rem){
                count++;
                flag = true;
            }
            num /= 10;
        }
        if(flag){
            System.out.println("The number of occurence of the digit "+dig+" is "+count);
        }
        else{
            System.out.println("The digit you enter is not present in the number.");
        }
    }
}
