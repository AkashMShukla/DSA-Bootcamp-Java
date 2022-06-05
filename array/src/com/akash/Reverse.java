package com.akash;
import java.util.Arrays;
public class Reverse{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};  //Even & odd number of elements both will be reversed.
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;            //It is known as two pointer method. one pointer at start,second at last.
            end--;
        }
    }
    static void swap(int[] arr,int index1, int index2){ //This is code of Swapping
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}