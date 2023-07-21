package hashing;

import java.util.HashMap;
import java.util.Map;

public class MinumumLengthSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {3, 4, -5, 10, 2, 1};
        int n = arr.length;
        int K = 2;
        System.out.println(smallestSubarraySumK(arr, n, K));
    }
    static int smallestSubarraySumK(int[] arr, int n, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        if(arr[0]==k) return 1;
        for(int i=1;i<n;i++){
            sum += arr[i];
            if(sum == k) smallest = Math.min(i+1,smallest);
            if(hmap.containsKey(sum-k)){
                smallest = Math.min(smallest,i-hmap.get(sum-k));
            }
            hmap.put(sum,i);
        }
        return smallest<Integer.MAX_VALUE ? smallest : -1;
    }
}
