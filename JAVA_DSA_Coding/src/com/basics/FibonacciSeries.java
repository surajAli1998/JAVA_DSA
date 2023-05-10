package com.basics;

import java.util.Scanner;

//code to find the nth fibonacci number
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which fibonacci term you want to print?");
        int n = sc.nextInt();
        int prev = 0;
        int currnt = 1;
        int temp;
        int c = 2;
        while(c<=n){
            temp = currnt;
            currnt += prev;
            prev = temp;
            c += 1;
        }
        System.out.println("The fibonacci term you want to print is: "+currnt);
    }
}
