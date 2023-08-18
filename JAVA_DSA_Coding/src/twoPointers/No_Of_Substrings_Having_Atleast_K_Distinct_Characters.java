package twoPointers;

import java.util.HashMap;
import java.util.Map;

public class No_Of_Substrings_Having_Atleast_K_Distinct_Characters {
    public static void main(String[] args) {
        String S = "abc";
        int K = 2;
        int ans = atleastkDistinctChars(S, K);
        System.out.println(ans);
    }
    static int atleastkDistinctChars(String str, int k) {
        int count = 0, start = 0, end = 0, len = str.length();
        Map<Character, Integer> hmap = new HashMap<>();
        while(end<len){
            char c = str.charAt(end);
            hmap.put(c,hmap.get(c)==null?1:hmap.get(c)+1);
            end++;
            if(hmap.size()>=k){
                char ch = str.charAt(start);
                hmap.put(ch,hmap.get(ch)==null?1:hmap.get(ch)-1);
                if(hmap.get(ch)==0){
                    hmap.remove(ch);
                }
                count += len - end + 1;
                start++;
            }
        }
        return count;
    }
}
