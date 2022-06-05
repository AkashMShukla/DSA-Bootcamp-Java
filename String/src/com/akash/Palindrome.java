package com.akash;
public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){  //This condition is for to check if string is null or zero.
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}