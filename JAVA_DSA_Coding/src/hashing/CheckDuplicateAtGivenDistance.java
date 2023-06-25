package hashing;

import java.util.HashMap;
import java.util.Map;

//Find is there any duplicate element in the array at a given distance K

public class CheckDuplicateAtGivenDistance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int size = arr.length;
        boolean bool = checkDuplicatesWithinK(arr, size, 3);
        if(bool) System.out.println("Yes duplicate present");
        else System.out.println("No such duplicate.");
    }
    static boolean checkDuplicatesWithinK(int[] arr, int size, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<size;i++){
            if (!hmap.containsKey(arr[i])){
                hmap.put(arr[i],i);
            }
            else{
                int pos = hmap.get(arr[i]);
                if (i-pos<=k) return true;
                else hmap.put(arr[i],i);
            }
        }
        return false;
    }
}
