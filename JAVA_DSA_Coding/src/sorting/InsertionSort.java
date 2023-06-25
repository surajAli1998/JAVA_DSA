package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,1,4,0,-2,-25};
        int size = arr.length;
        insertionSort(arr, size);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[]arr, int n){
        for(int i=0;i<n-1;i++){
            int j=i;
            while(j>=0 && arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                j--;
            }
        }
    }
    static void swap(int[]arr, int index1, int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
