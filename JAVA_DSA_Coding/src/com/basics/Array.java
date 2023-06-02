package com.basics;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    /*
    array is collection of variables of same datatype
    syntax
    datatype[] variableName  = new datatype[size]
    or
    datatype[] variableName = {1,2,3,...}
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr1 = new int[3];
//        for(int i=0; i<arr1.length; i++){
//            arr1[i] = sc.nextInt();
//        }
////        for (int j : arr1) {
////            System.out.print(j + " ");
////        }
//        System.out.println("The array is: "+ Arrays.toString(arr1));
        int[] arr2 = {1,2,3};
        System.out.println("Array before change: "+Arrays.toString(arr2));
        change(arr2);
        System.out.println("Array before change: "+Arrays.toString(arr2));
    }
    static void change(int[] arr) {
        arr[1] = 12;
    }
}
