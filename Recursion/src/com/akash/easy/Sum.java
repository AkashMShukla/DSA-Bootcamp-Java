package com.akash.easy;
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
