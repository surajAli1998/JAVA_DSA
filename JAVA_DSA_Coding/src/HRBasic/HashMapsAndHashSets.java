package HRBasic;

import java.util.*;

public class HashMapsAndHashSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] query = {2,3,5};
//        System.out.println("Enter ur queries:");
//        for(int i=0; i<3; i++){
//            query[i]=sc.nextInt();
//        }
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(2);
        for(int i=0; i<3; i++){
            System.out.println(set.contains(query[i]));
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,1);
        map.put(3,5);
        for(int i=0; i<3; i++){
            System.out.print(map.containsKey(query[i])+" ");
            System.out.print(map.get(query[i]));
            System.out.println();
        }
    }
}
