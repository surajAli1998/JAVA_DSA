package hashing;

import java.util.HashSet;
import java.util.Set;

/*
Check if there is any such pair exist in the array where the sum of the both elements of that pair
is equal to some given value
*/

public class CheckPairOfSumOfGivenValue {
    public static void main(String[] args) {
        int[] arr = {1, -2, -1, 1, 3};
        int x = 4;
        int size = arr.length;
        boolean bool = pairSum(arr, x, size);
        if(bool) System.out.println("Yes Pair is there in the array");
        else System.out.println("No such pair");
    }
    static boolean pairSum(int[] arr, int x, int size) {
        Set<Integer> hset = new HashSet<>();
        for(int i=0;i<size;i++){
            int temp = x - arr[i];
            if(hset.contains(temp)) return true;
            else{
                hset.add(arr[i]);
            }
        }
        return false;
    }
}
