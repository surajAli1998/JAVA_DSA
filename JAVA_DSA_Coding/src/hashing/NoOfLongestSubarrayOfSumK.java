package hashing;

import java.util.HashMap;
import java.util.Map;

public class NoOfLongestSubarrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9,8,7};
        int k=15, longest = 0, ans = 0;
        int size = arr.length;
        longest = longestSubArray(arr, size, k);
        System.out.println(longest);
        ans = countOfLongestSubArray(arr,size, k, longest);
        System.out.println(ans);
    }
    static int countOfLongestSubArray(int[] arr, int size, int k, int longest) {
        int i = 0, sum = 0, count = 0;
        for(int j=0; j<size; j++){
            sum += arr[j];
            if(j-i+1 == longest){
                if(sum == k) count++;
                sum -= arr[i];
                i++;
            }
        }
        return count;
    }
    static int longestSubArray(int[] arr, int size, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int sum = 0;
        int longest = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            sum += arr[i];
            if(sum == k) longest = Math.max(longest, i+1);
            else if(hmap.containsKey(sum - k)){
                longest = Math.max(longest, i - hmap.get(sum - k));
            }
            else if(!hmap.containsKey(sum)){
                hmap.put(sum, i);
            }
        }
        return longest == Integer.MIN_VALUE ? 0 : longest;
    }
}
