package com.akash.easy;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
public class CountSteps {
    public static void main(String[] args) {
        System.out.println(NumberOfSteps(41));
    }
    static int NumberOfSteps(int n){
        return helper(n, 0);
    }
    static int helper(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n%2 == 0){
            return helper(n/2,++steps);// OR steps+1
        }
        return helper(n-1,++steps);// OR steps+1
    }
}
