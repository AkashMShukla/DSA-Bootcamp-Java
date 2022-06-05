package com.akash;
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,5,3,6};
        int[] num = {2,5,6,3,-5,-3,-6};
        System.out.println(ans(arr));
        System.out.println(ans1(num));
    }
    static int ans(int[] arr){
        int unique = 0;

//        for (int i = 0; i < arr.length; i++) {
//            unique ^= arr[i];
//        }
        // OR
        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
    static int ans1(int[] arr){
        int unique = 0;

//        for (int i = 0; i < arr.length; i++) {
//            unique ^= arr[i];
//        }
        // OR
        for(int n : arr){
            unique += n;
        }

        return unique;
    }
}
