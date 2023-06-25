package hashing;

import java.util.HashMap;
import java.util.Map;

/*
Find the sum of such elements of an array where those elements are repetative and their frequency
is greater than or equals to them.
 */

public class SumOfElementsWithFrequencyOfGivenCondition {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 1, 6};
        int n = arr.length;
        countSum(arr, n);
    }
    static void countSum(int[]arr, int n){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int a:arr){
            if(hmap.containsKey(a)){
                int val = hmap.get(a);
                hmap.put(a,val+1);
            }
            else{
                hmap.put(a,1);
            }
        }
        int sum = 0;
        for(int key:hmap.keySet()){
            int val = hmap.get(key);
            if(val>=key){
                sum = sum+key;
            }
        }
        System.out.println(sum);
    }
}
