package com.basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empid");
        int empId = sc.nextInt();
        System.out.println("Enter the department");
        String dept = sc.next();

        System.out.println("Enter the fruit name: ");
        String fruit = sc.next();
        //Traditional switch case format
        switch (fruit){
            case "Mango":
                System.out.println("King of all fruits");
                /*
                here if we don't give break then it will simply print this one and block of apple as well
                that means once the block of the matched case executes all the next case blocks will also execute
                till it find next break statement.
                 */
            case "Apple":
                System.out.println("Good enough for skin");
                break;
            case "Orange":
                System.out.println("Full of vitamin c");
                break;
            /*
            default will execute only if no matched cases found.
             */
            default:
                System.out.println("Enter a valid fruit name");
        }

        //Enhanced switch case format
        switch (fruit) {
            //here no need to give break explicitly, its already inbuild.
            case "Mango" -> {
                System.out.println("Its a summer fruit");
                System.out.println("King of all fruits");
            }
            case "Apple" -> System.out.println("Good enough for skin");
            case "Orange" -> System.out.println("Full of vitamin c");
            default -> System.out.println("Enter a valid fruit name");
        }


        //Nested switch case
        switch (empId){
            case 1:
                System.out.println("Employee name is Suraj");
                break;
            case 2:
                System.out.println("Employee name is Souvik");
                break;
            case 3:
                switch (dept){
                    case "IT":
                        System.out.println("It Department Employee");
                        break;
                    case "BPO":
                        System.out.println("BPO Department Employee");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Invalid input");
        }

        //Enhanced nested switch
        switch (empId) {
            case 1,2,3 -> System.out.println("Employee name is Suraj");
            //case 2 -> System.out.println("Employee name is Souvik");
            case 4 -> {
                switch (dept) {
                    case "IT" -> System.out.println("It Department Employee");
                    case "BPO" -> System.out.println("BPO Department Employee");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Invalid input");
        }
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3 -> System.out.println("hello its 1,2,3");
            case 5, 6 -> System.out.println("its 5,6");
            default -> System.out.println("good night");
        }
    }
}
