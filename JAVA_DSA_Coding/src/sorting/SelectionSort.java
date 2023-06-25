package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,1,4,0,-2,-25};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size-1;i++){
            int lastIndex = size-i-1;
            int maxIndex = maxIndexInArray(arr, 0, lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[]arr, int index1, int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static int maxIndexInArray(int[] arr, int index1, int index2) {
        int max = index1;
        for(int i = index1+1; i<=index2; i++){
            if(arr[i]>=arr[max]){
                max=i;
            }
        }
        return max;
    }
}
