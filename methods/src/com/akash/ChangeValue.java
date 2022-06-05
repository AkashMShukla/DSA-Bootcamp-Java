package com.akash;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,4,33,5,54};
        change(arr);
        System.out.println(Arrays.toString(arr));//Here we get updated value from method we are calling
        //This is also a call by value. Passing the value of the reference variable
    }
    static void change(int[] nums){
        nums[0] = 99;//If u make a change to the object via this reference variable,
        // same object i.e. original object will be changed.
    }
}
