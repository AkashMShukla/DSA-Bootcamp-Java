package com.akash;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,4,68,24,28,1,9};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 5)); //To find maximum value in given range.
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // To find maximum value in given Range of Index
    //work on egde cases here, like array being null
    static int maxRange(int[] arr, int start, int end){
        if(end > start){  //This is edge case (Optional)
            return -1;
        }
        if(arr == null){  //Edge Case. Optional
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
