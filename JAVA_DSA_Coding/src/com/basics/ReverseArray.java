package com.basics;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,14,34};
        System.out.println("Before reverse: "+ Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After swapping: "+ Arrays.toString(arr));
    }
    static void reverseArray(int[] arr) {
        int start;
        int end;
        for(start=0, end=arr.length-1; start<end; start++, end--){
           swapElement(arr, start, end);
        }
        //or
//        int start=0;
//        int end= arr.length-1;
//        while(start<end){
//            swapElement(arr, start, end);
//            start++;
//            end--;
//        }
    }
    static void swapElement(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
