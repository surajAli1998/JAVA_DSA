package hashing;

import java.util.HashMap;
import java.util.Map;

//To check if an array is subset of another array

public class SubsetChecking {
    public static void main(String[] args) {
        int[] arr1 = {6,7,3,2,2};
        int[] arr2 = {6,7,2,2};
        boolean ans = isSubset(arr1, arr2);
        if(ans) System.out.println("Yes");
        else System.out.println("NO");
    }
    static boolean isSubset(int[] arr1, int[] arr2) {
        if(arr1.length<arr2.length) return false;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int a:arr1) {
            if (hmap.containsKey(a)) {
                int val = hmap.get(a);
                hmap.put(a, val + 1);
            } else {
                hmap.put(a, 1);
            }
        }
        for(int a:arr2){
            if(!hmap.containsKey(a)) return false;
            else if (hmap.get(a)==0) return false;
            else{
                int val = hmap.get(a);
                hmap.put(a,val-1);
            }
        }
        return true;
    }
}
