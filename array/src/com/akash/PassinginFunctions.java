package com.akash;
import java.util.Arrays;

public class PassinginFunctions{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);                               // Here we can change value of Array. Hence array is mutable, String is immutable.
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1] = 99;
    }
}