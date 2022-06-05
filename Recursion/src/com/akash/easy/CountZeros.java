package com.akash.easy;
public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(5075006));
    }
    static int count(int n){
        //int c = 0;
        //return helper(n,c);
        // OR we can do directly as below,
        return helper(n,0);
    }
    //Special pattern, How to pass a value to above calls
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,++c);//OR We can use c+1. But we can't use c++, This will be infinite
        }
        return helper(n/10,c);
    }
}
