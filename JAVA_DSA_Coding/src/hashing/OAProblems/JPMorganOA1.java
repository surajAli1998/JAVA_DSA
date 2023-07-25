package hashing.OAProblems;

import javax.swing.event.ListDataEvent;
import java.util.*;

public class JPMorganOA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> ls = new ArrayList<>();
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        System.out.println("Enter the strings: ");
        for(int i=0; i<n; i++){
            ls.add(sc.next());
        }

        List<String> ans = new ArrayList<>();
        ans.add(ls.get(0));

//        treemap implementation
        Map<Character,Integer> oldMap = new TreeMap<>();
        Map<Character,Integer> newMap = new TreeMap<>();
        for(char c:ls.get(0).toCharArray()){
            oldMap.put(c,oldMap.get(c)==null?1:oldMap.get(c)+1);
        }
        int len = ls.size();
        for(int i=1;i<len;i++){
            newMap.clear();
            for(char c:ls.get(i).toCharArray()){
                newMap.put(c, newMap.get(c)==null?1:newMap.get(c)+1);
            }
            if(!newMap.equals(oldMap)){
                ans.add(ls.get(i));
                oldMap.putAll(newMap);
            }
        }


//        array as map implementation
//        int[] prevArr = new int[26];
//        int[] curArr = new int[26];
//        for(char c:ls.get(0).toCharArray()){
//            prevArr[c - 'a']++;
//        }
//        int len = ls.size();
//        for(int i=1; i<len; i++){
//            for(int j=0;j<26;j++){
//                curArr[j] = 0;
//            }
//            for(char c:ls.get(i).toCharArray()){
//                curArr[c - 'a']++;
//            }
//            if(!Arrays.equals(curArr, prevArr)){
//               ans.add(ls.get(i));
//               prevArr = curArr.clone();
//            }
//        }

        System.out.println(ans);
    }
}
