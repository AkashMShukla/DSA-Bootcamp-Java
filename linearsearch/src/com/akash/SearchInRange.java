package com.akash;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,87,34,7,90,56,88,4,-5,26};
        int target = 34;
        System.out.println(linearSearch(arr,target,1,5));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        // run for a loop
        for(int index = start;index <= end;index++){
            // check for every index if it is == target
            if(arr[index] == target){
                return index;
            }
        }
        return-1;
    }
}
