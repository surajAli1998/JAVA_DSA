package com.basics;

import java.util.Scanner;

public class LargestOfGivenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int max=0;
//        if(a<b){
//            max=b;
//        }else{
//            max=a;
//        }
//        if(c>max){
//            max=c;
//        }

        int max = Math.max(c, Math.max(a,b));
        System.out.println("Largest one is: "+max);
    }
}
