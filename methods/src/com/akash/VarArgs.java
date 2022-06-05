package com.akash;

import java.util.Arrays;

public class VarArgs{
    public static void main(String[] args) {
        fun(2,3,4,5,5,2,4,33,4,4454,33);
        multiple(3,4,"Akash","Welcome");
        overloading(2,3,4,2,2);
        overloading("Hello", "How r U");
//        overloading();//We can't call empty function while overloading function in case of VarArgs.
        //It will confuse which function have to call. function taking argument as int one or String one.
    }
    static void overloading(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void overloading(String...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String...v){//Variable argument parameter must be the last in the list
        //We can't add String...v before int b or before int a. (...v)It must be added last
        System.out.println(Arrays.toString(v));
    }
}