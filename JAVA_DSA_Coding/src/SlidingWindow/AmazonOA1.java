package SlidingWindow;

//Fixed size sliding window-> max sum of sub array of size k

public class AmazonOA1 {
    public static void main(String[] args) {
        int[] arr = {10,4,8,13,20};
        int m = 2;
        int start = 0, end = 0, sum = 0, totalSum = 0, maxSum = 0;
        for (int j : arr) {
            totalSum += j;
        }
        while(end<arr.length){
            sum+=arr[end];
            if(end-start+1 < m){
                end++;
            }
            else if(end-start+1 == m){
                maxSum = Math.max(maxSum, sum);
                sum-=arr[start];
                start++;
                end++;
            }
        }
        System.out.println(totalSum-maxSum);
    }
}
