package HRBasic;

import java.util.*;

public class HashMapsAndHashSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] query = {2,3,5};
////        System.out.println("Enter ur queries:");
////        for(int i=0; i<3; i++){
////            query[i]=sc.nextInt();
////        }
//        Set<Integer> set = new HashSet<>();
//        set.add(2);
//        set.add(3);
//        set.add(2);
//        for(int i=0; i<3; i++){
//            System.out.println(set.contains(query[i]));
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(2,1);
//        map.put(3,5);
//        for(int i=0; i<3; i++){
//            System.out.print(map.containsKey(query[i])+" ");
//            System.out.print(map.get(query[i]));
//            System.out.println();
//        }
        System.out.println("Enter the array range:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] query = {2,3,5};
        frequencyOfElement(arr,query,n);
    }
    static void frequencyOfElement(int[] arr, int[] query, int n) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n; i++){
            if(hmap.containsKey(arr[i])){
                int value = hmap.get(arr[i]);
                hmap.put(arr[i],value+1);
            }
            else{
                hmap.put(arr[i],1);
            }
        }
        for(int q:query){
            System.out.println(q+": "+hmap.get(q));
        }
    }
}
