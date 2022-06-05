package com.akash;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23,63,12,454,87,-7,73};
        int target = 87;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    //Search in the array: return the index if item found
    //Otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // run for a loop
        for(int index = 0;index < arr.length;index++){
            // check for every index if it is == target
            if(arr[index] == target){
                return index;
            }
        }
        return-1;
    }
}
