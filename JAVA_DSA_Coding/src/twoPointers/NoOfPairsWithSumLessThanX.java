package twoPointers;

public class NoOfPairsWithSumLessThanX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int x = 7;
        System.out.print(findPairs(arr, n, x));
    }
    static int findPairs(int[] arr, int n, int x) {
        int ans = 0;
        int start = 0, end = n-1;
        while(start<end){
            int sum = 0;
            sum = arr[start]+arr[end];
            if(sum<x){
                ans += end - start;
                start++;
            }
            else end--;
        }
        return ans;
    }
}
