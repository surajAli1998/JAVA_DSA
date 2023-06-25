package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//How to find the minimum no of operation needed to make all the array elements equal

public class MakeAllEqualInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 3, 3};
        int n = arr.length;

        Map<Integer,Integer> hmap = new HashMap<>();
        for(int a:arr) {
            if (hmap.containsKey(a)) {
                int val = hmap.get(a);
                hmap.put(a, val + 1);
            } else {
                hmap.put(a, 1);
            }
        }

        int maxFreq = 0;
        for(int key:hmap.keySet()){
            int currFreq = hmap.get(key);
            if(currFreq>maxFreq){
                maxFreq = currFreq;
            }
        }

        System.out.println("Minimum no of operation needed to make all array elements equal is: "+(n-maxFreq));
    }
}
