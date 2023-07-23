package hashing.OAProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiscoOA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int n = sc.nextInt();
        System.out.println("Enter packet rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter the max packet limit: ");
        int max_packets = sc.nextInt();
        System.out.println("Enter request matrix elements: ");
        int[][] request = new int[n][2];
        Map<Integer,Integer> hmap = new HashMap<>();
        int maxTime = 0;
        for(int i=0; i<n; i++){
            request[i][0] = sc.nextInt();
            request[i][1] = sc.nextInt();
            hmap.put(request[i][0], request[i][1]);
            maxTime = Math.max(maxTime, request[i][0]);
        }
        int ans = 0;
//        ans  = bruteForceSolution(maxTime, max_packets, rate, hmap);
        ans  = optimizedSolution(request, n, max_packets, rate, hmap);
        System.out.println(ans);
    }
    static int optimizedSolution(int[][] request, int n, int max_packets, int rate, Map<Integer, Integer> hmap) {
        int curPacket = 0;
        int ans = 0;
        int t = 0;
        while(t<n){
            int curTime = request[t][0];
            curPacket += hmap.get(curTime);
            if(curPacket > max_packets){
                int drop =  curPacket - max_packets;
                ans += drop;
                curPacket = max_packets;
            }
            if(t<n-1){
                int nextTime = request[t+1][0];
                int diff = (nextTime - curTime);
                curPacket -= (diff * rate);
            }
            t++;
        }
        return ans;
    }
    static int bruteForceSolution(int maxTime, int max_packets, int rate, Map<Integer, Integer> hmap) {
        int curPacket = 0;
        int ans = 0;
        for(int t=1; t<=maxTime; t++){
            if(hmap.get(t)!=null){
                curPacket += hmap.get(t);
                if(curPacket > max_packets){
                    int drop =  curPacket - max_packets;
                    ans += drop;
                    curPacket = max_packets;
                }
                curPacket -= rate;
            }
            else{
                curPacket -= rate;
            }
            if(curPacket<0) curPacket =0;
        }
        return ans;
    }
}
