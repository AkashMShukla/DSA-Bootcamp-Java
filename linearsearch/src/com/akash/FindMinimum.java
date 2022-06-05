package com.akash;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {5,3,23,-8,45,-92,34,8,24,79};
        System.out.println(min(arr));
    }
    //Assume arr.length != 0  //
    //Return the minimum value in the array
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){       //We can do same for Finding Maximum value by doing some minor changes
                min = arr[i];
            }
        }
        return min;
    }
}
