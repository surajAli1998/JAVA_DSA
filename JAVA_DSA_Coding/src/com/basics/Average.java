package com.basics;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        float avg;
        int c=0;
        for(int i = 0; i<num; i++){
            int n = sc.nextInt();
            sum = sum+n;
            c++;
        }
        avg= (float) sum /c;
        System.out.println("Average is: "+ avg);
    }
}
