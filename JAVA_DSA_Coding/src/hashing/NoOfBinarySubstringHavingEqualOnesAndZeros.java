package hashing;

import java.util.HashMap;
import java.util.Map;

public class NoOfBinarySubstringHavingEqualOnesAndZeros {
    public static void main(String[] args) {
        int ans = 0, count = 0;
        String str = "010011";
        int size = str.length();

//        brute force
//        for(int i=0; i<size-1; i++){
//            int c0 = 0, c1 = 0;
//            char c = str.charAt(i);
//            if(c == '0') c0++;
//            else c1++;
//            for(int j=i+1; j<size; j++){
//                if(str.charAt(j) == '0') c0++;
//                else c1++;
//                if(c0 == c1) ans++;
//            }
//        }

//        optimized
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            char c = str.charAt(i);
            if(c == '1') arr[i] = 1;
            else arr[i] = -1;
        }
        Map<Integer,Integer> hmap = new HashMap<>();
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum == 0) ans++;
            if (hmap.containsKey(sum)) {
                ans += hmap.get(sum);
            }
            hmap.put(sum, hmap.get(sum) == null ? 1 : hmap.get(sum) + 1);
        }

        System.out.println(ans);
    }
}
