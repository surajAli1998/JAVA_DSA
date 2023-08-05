package twoPointers;

public class LongestSubarraySumAtMostK {
    public static void main(String[] args) {
        int[] arr = {8,2,6,2,1,1,4,2};
        int size = arr.length;
        int k = 10;
//        int result = atMostSum(arr, size, k);
        int result = slidingWindow(arr, size, k);
        System.out.println(result);
    }


    //sliding window using single pointer:
    static int slidingWindow(int[] arr, int size, int k) {
        int sum = 0;
        int len = 0;
        int maxLen = 0;
        for(int i=0; i<size; i++){
            if(sum+arr[i]<=k){
                sum+=arr[i];
                len++;
            }
            else{
                sum = sum - arr[i-len] + arr[i];
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }



    //brute force solution
//    static int atMostSum(int[] arr, int size, int k) {
//        int ans = 0;
//        int j = 1;
//        for(int i=0; i<size; i++){
//            int sum = 0;
//            sum = arr[i];
//            j=i+1;
//            int len = 1;
//            while(sum<=k && j<size){
//                sum+=arr[j];
//                if(sum<=k){
//                    len++;
//                }
//                j++;
//            }
//            ans = Math.max(ans, len);
//        }
//        return ans;
//    }

}
