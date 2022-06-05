package com.akash;
public class Overloading{
    public static void main(String[] args) {
        fun(23);
        fun("Akash");
//        fun();//We can't call empty function in function overloading. It will give error.
        //because it will confuse which function have to call.
    }
    //This is called function/method overloading. Same name but Parameters are different.
    static void fun(int a){
        System.out.println("First One :");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second One :");
        System.out.println(name);
    }
}