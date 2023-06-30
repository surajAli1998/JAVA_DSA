package hashing;

import java.util.*;

public class BasicPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the array elements");
        for(int i=0; i<5; i++){
            int n = sc.nextInt();
            arr.add(n);
        }
        Map<Integer,Integer> hmap = new HashMap<>();
        int sum = 0;
        for (int i=0;i<arr.size();i++){
            sum = sum + arr.get(i);
            hmap.put(i,sum);
        }
        System.out.println("Enter no of queries:");
        int q = sc.nextInt();
        while (q>0){
            System.out.println("Enter left index");
            int leftIndex = sc.nextInt();
            System.out.println("Enter right index");
            int rightIndex = sc.nextInt();
            int sumUptoRightIndex = hmap.get(rightIndex);
            int sumUptoLeft = leftIndex==0?0:hmap.get(leftIndex-1);
            System.out.println("The sub array sum is: "+(sumUptoRightIndex-sumUptoLeft));
            q--;
        }
    }
}
