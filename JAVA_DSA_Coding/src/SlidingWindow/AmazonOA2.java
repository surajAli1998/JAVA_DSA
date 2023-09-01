package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*Fixed size sliding window with hashing -> we have to find out the max sum of given size sub array but we cant
consider the sub arrays who have duplicates, so sub array size should be k and it should contain all
unique values
 */

public class AmazonOA2 {
    public static void main(String[] args) {
        int[] arr = {1,2,7,7,4,3,6};
        int k = 3;
        int start = 0, end = 0, sum = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(end<arr.length){
            sum += arr[end];
            map.put(arr[end],map.get(arr[end])==null?1:map.get(arr[end])+1);
            if(end-start+1 < k){
                end++;
            }
            else if(end-start+1 == k){
                if(map.size()==k){
                    ans = Math.max(ans, sum);
                }
                sum -= arr[start];
                map.put(arr[start],map.get(arr[start])==null?1:map.get(arr[start])-1);
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                start++;
                end++;
            }
        }
        System.out.println(ans);
    }
}
