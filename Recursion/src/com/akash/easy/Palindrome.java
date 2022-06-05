package com.akash.easy;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(IsPalindrome(5685));
    }
    static boolean IsPalindrome(int n){
        return n == Rev(n);
    }
    static int Rev(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}
