package hashing;

import java.util.HashMap;
import java.util.Map;

public class NoOfSmallestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9,8,7};
        int k=15, smallest = 0, ans = 0;
        int size = arr.length;
        smallest = smallestSubArray(arr, size, k);
        System.out.println(smallest);
        ans = countOfSmallestSubArray(arr,size, k, smallest);
        System.out.println(ans);
    }
    static int countOfSmallestSubArray(int[] arr, int size, int k, int smallest) {
        int i = 0, sum = 0, count = 0;
        for(int j=0; j<size; j++){
            sum += arr[j];
            if(j-i+1 == smallest){
                if(sum == k) count++;
                sum -= arr[i];
                i++;
            }
        }
        return count;
    }
    static int smallestSubArray(int[] arr, int size, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            sum += arr[i];
            if(sum == k) smallest = Math.min(smallest, i+1);
            else if(hmap.containsKey(sum - k)){
                smallest = Math.min(smallest, i - hmap.get(sum - k));
            }
            hmap.put(sum, i);
        }
        return smallest == Integer.MAX_VALUE ? 0 : smallest;
    }
}
