package com.akash;

public class OddEven {

    public static void main(String[] args) {
	// write your code here
        int n = 74;
        System.out.println(IsOdd(n));
    }
    static boolean IsOdd(int n){
        return (n & 1) == 1;
    }
}
