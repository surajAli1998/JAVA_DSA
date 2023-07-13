package hashing.OAProblems;
/*
Given an array A consisting of N integers, returns the maximum sum of two numbers whose digits add up to an
equal sum. if there are not two numbers whose digits have an equal sum, the function should return -1.
Constraints: N is integer within the range [1, 200000]
each element of array A is an integer within the range [1, 1000000000]

Example1:
Input:
A = [51, 71, 17, 42]
Output: 93
Explanation: There are two pairs of numbers whose digits add up to an equal sum: (51, 42) and (17, 71), The
first pair sums up to 93

Example2:
Input:
A = [42, 33, 60]
Output: 102
Explanation: The digits of all numbers in A add up the same sum, and choosing to add 42 and 60 gives the
result 102

Example3:
Input:
A = [51, 32, 43]
Output: -1
Explanation: All numbers in A have digits that add up to different, unique sums
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MicrosoftOA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter the array elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Brute Force Solution, TC: O(N^2) SC: O(1)
//        int max = -1;
//        for(int i=1; i<=n; i++){
//            int j = i-1;
//            while(j>=1){
//                if(digitSum(arr[j]) == digitSum(arr[i])){
//                    int sum = 0;
//                    sum += arr[i] + arr[j];
//                    max = Math.max(max, sum);
//                }
//                j--;
//            }
//        }
//        System.out.println(max);
//    }

        // Optimized solution with hashmap TC: O(N)  SC: O(1)
        Map<Integer,Integer> hmap = new HashMap<>();
        int max = -1;
        for(int i=1; i<=n; i++){
            int digSum = digitSum(arr[i]);
            if(hmap.containsKey(digSum)){
                int sum = 0;
                sum += arr[i]+hmap.get(digSum);
                max = Math.max(max, sum);
            }
            else{
                hmap.put(digSum, arr[i]);
            }
        }
        System.out.println(max);
    }
    static int digitSum(int num) {
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
