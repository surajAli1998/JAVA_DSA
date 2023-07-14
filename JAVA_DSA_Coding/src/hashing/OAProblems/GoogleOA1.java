package hashing.OAProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoogleOA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter the array elements:");

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        for(int i=1; i<=n; i++){
            int temp = arr[arr[arr[i]]];
            if(hmap.containsKey(temp)){
                count += hmap.get(temp);
                hmap.put(temp, hmap.get(temp)+1);
            }
            else{
                hmap.put(temp, 1);
            }
        }

        System.out.println(count);
    }
}
