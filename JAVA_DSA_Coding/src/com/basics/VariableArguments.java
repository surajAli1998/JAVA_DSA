package com.basics;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        /*
        we can give n number of integer values as varArg method is accepting variable arguments
         */
        varArg(12,1,5,5,3,98);
        multiParameter(23, 45, "suraj","Karar", "Patwa");
    }

    static void varArg(int ...v){
        System.out.println(Arrays.toString(v));
    }


    //vararg must be used as the last argument for method
    static void multiParameter(int a, int b, String ...str){
    }
}
