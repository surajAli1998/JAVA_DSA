package hashing.OAProblems;

import java.util.*;

public class AxisBankOA1 {
    public static void main(String[] args) {
        String str = "cat batman latt matter cat matter cat";
        String[] arr = str.split(" ");
        List<String> ans = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        Map<String, Integer> hmap = new HashMap<>();
        for (String s : arr) {
            hmap.put(s, hmap.get(s) == null ? 1 : hmap.get(s) + 1);
        }
        for(String key:hmap.keySet()){
            if(hmap.get(key)>1){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        for(String s:ans){
            System.out.print(s+" ");
        }
    }
}
