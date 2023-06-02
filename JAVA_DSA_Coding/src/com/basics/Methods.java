package com.basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //sum();
        //int sum = sum2();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int num2 = sc.nextInt();
//        int sum = sum3(num1,num2);
//        System.out.println("The sum is: "+sum);
//        System.out.println("Enter your name: ");
//        String naam = sc.next();
//        //String greetings = greetMe(naam);
//        //changeName(naam);
//        String naam2 = changeName2(naam);
//        System.out.println(naam2);

        String fruit = "Apple";

        {
            fruit = "Mango";
            System.out.println(fruit);
        }
        System.out.println(fruit);
    }

    static String greetMe(String name){
        String greeting = "Congratulations "+name;
        return greeting;
    }

    /* here ref variable name2 will point to new string object "Ali" that's why main object
    pointed by naam is not changed so naam will still be the same given as input*/
    static void changeName(String name1){
        name1 = "Ali";
    }

    /*
    In this case name2 will also point to new object "Ali" but here we are returning the value of name2 that's
    why in main method name1 ref var will now point to same object pointed by name2 which is "Ali" so output
    is Ali
     */
    static String changeName2(String name2){
        name2 = "Ali";
        return name2;
    }

    //method without return type or void type
//    static void sum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int num2 = sc.nextInt();
//        int sum = num1+num2;
//        System.out.println("The sum is: "+ sum);
//    }
//
//    //method with return type
//    static int sum2(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int num2 = sc.nextInt();
//        int sum = num1+num2;
//        return sum;
//    }

    //method with arguments
    static int sum3(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
