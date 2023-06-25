package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        //even though we give initial capacity as 3, it doesn't matter
        for (int i=0;i<3;i++){
            ls.add(new ArrayList<>());
        }
        for (ArrayList<Integer> l : ls) {
            for (int j = 0; j < 3; j++) {
                l.add(sc.nextInt());
            }
        }
        for(ArrayList<Integer> l : ls){
            System.out.println(l);
        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(ls.get(i).get(j));
//            }
//            System.out.println();
//        }
//        System.out.println(ls);
//        System.out.println(ls.toString());
    }
}
