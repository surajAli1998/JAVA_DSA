package hashing.OAProblems;

import java.util.Map;
import java.util.TreeMap;

public class HackerRankContest {
    public static void main(String[] args) {
        int[] locations = {1,7,6,8};
        int n = locations.length;
        int[] movedFrom = {1,7,2};
        int[] movedTo = {2,9,5};
        Map<Integer,Integer> tmap = new TreeMap<>();
        for(int a:locations){
            tmap.put(a,1);
        }
        for(int i=0; i<movedTo.length; i++){
            if(tmap.containsKey(movedFrom[i])){
                tmap.remove(movedFrom[i]);
                tmap.put(movedTo[i],1);
            }
        }
        for(int key:tmap.keySet()){
            System.out.println(key);
        }
    }
}
