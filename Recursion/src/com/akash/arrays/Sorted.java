package com.akash.arrays;
public class Sorted {
    public static void main(String[] args) {
        int[] arr = {2,3,5,37,9};
        System.out.println(IsSorted(arr,0));
    }
    static boolean IsSorted(int[] arr, int index){
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && IsSorted(arr,index + 1);
    }
}
