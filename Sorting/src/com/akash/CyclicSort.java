package com.akash;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if(arr[i] != arr[CorrectIndex]){
                swap(arr, i, CorrectIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
