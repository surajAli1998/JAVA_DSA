package hashing.OAProblems;

import java.util.HashMap;
import java.util.Map;

public class AmazonOA1 {
    public static void main(String[] args) {
        String s = "aaaabc";
        String t = "aabcc";
        int ans = Integer.MAX_VALUE;
        Map<Character,Integer> hmap1 = new HashMap<>();
        Map<Character,Integer> hmap2 = new HashMap<>();
        for(char ch:s.toCharArray()){
            hmap1.put(ch, hmap1.get(ch)==null ? 1 : hmap1.get(ch)+1);
        }
        for(char ch:t.toCharArray()){
            hmap2.put(ch, hmap2.get(ch)==null ? 1 : hmap2.get(ch)+1);
        }
        for(char ch:t.toCharArray()){
            if(hmap1.containsKey(ch) && hmap2.containsKey(ch)) {
                ans = Math.min(ans, (hmap1.get(ch) / hmap2.get(ch)));
            }
            else{
                ans = 0;
                break;
            }
        }
        if(ans == Integer.MAX_VALUE) ans = 0;
        System.out.println(ans);
    }
}
