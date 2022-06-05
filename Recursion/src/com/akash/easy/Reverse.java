package com.akash.easy;
public class Reverse {
    public static void main(String[] args) {
        Rev1(74926);
        System.out.println(sum);
        System.out.println(Rev2(63589));
    }
    // Way - 1 : Using Parameters outside the function
    static int sum = 0;
    static void Rev1(int n){
        if(n == 0){ // If number is zero return
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        Rev1(n/10);
    }

    // Way - 2 : Using helper function.
    static int Rev2(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1; // To calculate number of digits of a number
        return helper(n, digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
