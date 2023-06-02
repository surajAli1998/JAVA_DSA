package com.basics;

import java.util.Arrays;

public class ArraySwap {
    //swapping any two values of given index of an array
    public static void main(String[] args) {
        int[] arr = {1,2,3,14};
        System.out.println("Before swapping: "+ Arrays.toString(arr));
        swapElement(arr, 0, 3);
        System.out.println("After swapping: "+ Arrays.toString(arr));
    }
    static void swapElement(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

