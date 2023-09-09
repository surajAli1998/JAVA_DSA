package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int k = 3;
        int start = 0, end = 0, sum = 0;
        List<Integer> ls = new ArrayList<>();
        while(end < n){
            sum += arr[end];
            if(end-start+1 < k) end++;
            else if(end-start+1 == k){
                 ls.add(sum);
                 sum -= arr[start];
                 start++;
                 end++;
            }
        }
        System.out.println(ls);
    }
}
