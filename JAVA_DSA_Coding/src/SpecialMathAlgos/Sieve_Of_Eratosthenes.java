package SpecialMathAlgos;

import java.util.Scanner;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] map = new boolean[n+1];
        sieveOfEratosthenes(n,map);
    }
    static void sieveOfEratosthenes(int n, boolean[] map) {
        for(int i=2; i*i<=n; i++){
            if(!map[i]){
                for(int j=i*2; j<=n; j+=i){
                    if(!map[j]) map[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!map[i]){
                System.out.println(i);
            }
        }
    }
}
