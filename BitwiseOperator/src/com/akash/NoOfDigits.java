package com.akash;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;  // Change base to 10 to check for Decimal
        int ans = (int)(Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
