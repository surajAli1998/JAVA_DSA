package hashing.OAProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AdobeOA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = sc.nextInt();
        int[] diffArr = new int[86401];
        for(int i=0; i<n; i++){
            int l;
            int r;
            l=sc.nextInt();
            r=sc.nextInt();
            diffArr[l]++;
            diffArr[r+1]--;
        }
        for(int i=1; i<=86400; i++){
            diffArr[i] = diffArr[i]+diffArr[i-1];
        }
        int peak = 0;
        for(int a:diffArr){
            if(a>peak){
                peak = a;
            }
        }
        int start = -1, end = -1;
        for(int i=1; i<=86400; i++){
            if(diffArr[i] == peak){
                int l = i;
                while(diffArr[l] == peak){
                    l++;
                }
                if((l-i)>(end-start+1)){
                    start = i;
                    end = l-1;
                }
                i = end;
            }
        }
        System.out.println(start+" "+end);
    }
}
