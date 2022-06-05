package com.akash.intro;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }
    static int Fibo(int n){
        //base Condition
        if(n < 2){
            return n;
        }
        return (Fibo(n-1)+Fibo(n-2));
    }
}
