package com.akash;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr= {
            {3,34,323,3},   // It has highest Wealth
            {76,78,8,6},
            {64,56,7,8,5,4}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts){
        int ans = 0;  // = Integer.MIN_VALUE
        for (int person = 0; person < accounts.length; person++) {
            //when u start a new col take new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
