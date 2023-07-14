package hashing.OAProblems;

import java.util.*;

public class ArcesiumOA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string array size: ");
        int size = sc.nextInt();
        String[] arr1 = new String[size];
        System.out.println("Enter the array1 strings: ");
        for(int i=0; i<size; i++){
            arr1[i] = sc.next();
        }

        String[] arr2 = new String[size];
        System.out.println("Enter the array2 strings: ");
        for(int i=0; i<size; i++){
            arr2[i] = sc.next();
        }

        String[] ans = new String[size];
        for(int i=0; i<size; i++){
            boolean bool = checkTwins(arr1[i], arr2[i]);
            if(bool) ans[i] = "YES";
            else ans[i] = "NO";
        }

        System.out.println(Arrays.toString(ans));
    }
    static boolean checkTwins(String x, String y) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map3 = new HashMap<>();
        Map<Character, Integer> map4 = new HashMap<>();
        int i = 0;
        while (i < x.length()) {
            char ch = x.charAt(i);
            if (i % 2 == 0) {
                map1.put(ch, map1.get(ch)==null?1:map1.get(ch)+1);
            } else {
                map2.put(ch, map2.get(ch)==null?1:map2.get(ch)+1);
            }
            i++;
        }

        i = 0;
        while (i < y.length()) {
            char ch = y.charAt(i);
            if (i % 2 == 0) {
                map3.put(ch, map3.get(ch)==null?1:map3.get(ch)+1);
            } else {
                map4.put(ch, map4.get(ch)==null?1:map4.get(ch)+1);
            }
            i++;
        }
        return map1.equals(map3) && map2.equals(map4);
    }
}
