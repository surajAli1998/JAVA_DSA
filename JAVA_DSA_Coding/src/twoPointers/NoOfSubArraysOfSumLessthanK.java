package twoPointers;

public class NoOfSubArraysOfSumLessthanK {
    public static void main(String[] args) {
        int[] array = { 1, 11, 2, 3, 15 };
        int k = 10;
        int size = array.length;
        int count = countSubarray(array, size, k);
        System.out.println(count);
    }
    static int countSubarray(int[] arr, int size, int k) {
        int start = 0, end = 0, sum = arr[0], count = 0;
        while(start<size && end<size){
            if(sum<k){
                end++;
                if(end>=start){
                    count += end-start;
                }
                if(end<size){
                    sum += arr[end];
                }
            }
            else{
                sum -= arr[start];
                start++;
            }
        }
        return count;
    }
}
