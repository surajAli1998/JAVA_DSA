package twoPointers;

import java.util.ArrayList;
import java.util.List;

public class ClosestPairOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {800, 1000, 1500, 1550, 1800};
        int target = 1100;
        int size = a.length;
        int start = 0, end = size - 1;
        int ans = 0;
        int num1 = 0, num2 = 0;
        List<Integer> ls = new ArrayList<>();
        int maxDiff = Integer.MAX_VALUE;
        int diff = 0;
        while(start<size && end>0){
            if(a[start] + b[end] <= target){
                int sum = a[start] + b[end];
                diff = Math.abs(sum-target);
                if(diff<maxDiff){
                    num1 = a[start];
                    num2 = b[end];
                    maxDiff = diff;
                }
//                if(sum > ans){
//                    ans = sum;
//                    num1 = a[start];
//                    num2 = b[end];
//                }
                start++;
            }
            else end--;
        }
        ls.add(num1);
        ls.add(num2);
        System.out.println(ans);
        System.out.println(ls.toString());
        System.out.println(diff);
    }
}
