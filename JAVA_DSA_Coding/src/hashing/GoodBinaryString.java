package hashing;

import java.util.Scanner;

public class GoodBinaryString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        while(tc!=0){
            String str = s.next();
            int res = goodBinary(str);
            System.out.println(res);
            tc--;
        }
    }
    static int goodBinary(String str) {
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return (str.length()-2);
        }
        else{
            return 2;
        }
    }
}


