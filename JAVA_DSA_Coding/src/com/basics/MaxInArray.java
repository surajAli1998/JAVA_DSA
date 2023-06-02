package com.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index1: ");
        int index1  = sc.nextInt();
        System.out.println("Enter the index2: ");
        int index2  = sc.nextInt();
        System.out.println();
        int maxElement = maxElementInArray(arr,index1,index2);
        System.out.println("The max element is: "+maxElement);
    }
    static int maxElementInArray(int[] arr, int index1, int index2) {
        //int max = arr[0];
        int max = arr[index1];
        for(int i=index1+1; i<=index2; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
