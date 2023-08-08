package twoPointers;

import java.util.Arrays;

public class SumOfPairClosestToTarget {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int n = arr.length;
        int x = 54;
        int[] ans  = sumClosest(arr, x);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sumClosest(int[] arr, int x) {
        int[] ans = new int[2];
        int start = 0, end = arr.length-1;
        int diff = 0;
        int minDiff = Integer.MAX_VALUE;
        int n1 = 0, n2 = 0;
        while(start< end){
            int sum = arr[start] + arr[end];
            diff = Math.abs(sum-x);
            if(diff < minDiff){
                n1 = arr[start];
                n2 = arr[end];
                minDiff = diff;
            }
            if(sum <= x) start++;
            else end--;
        }
        ans[0] = n1;
        ans[1] = n2;
        return ans;
    }
}
