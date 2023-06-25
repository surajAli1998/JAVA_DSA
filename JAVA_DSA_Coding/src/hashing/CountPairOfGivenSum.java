package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountPairOfGivenSum {
    public static void main(String[] args) {
        int[] arr = {5,5,5};
        int n = arr.length;
        int sum = 10;
        System.out.print("Count of pairs is "+ getPairsCount(arr, n, sum));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(k-arr[i])){
                count = count+hmap.get(k-arr[i]);
            }
            hmap.put(arr[i],hmap.get(arr[i])==null?1:hmap.get(arr[i])+1);
        }
        return count;
    }
}
