package com.akash.intro;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        if(n ==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n+1); // This is called tail recursion
        // This is the last function call
    }
}
