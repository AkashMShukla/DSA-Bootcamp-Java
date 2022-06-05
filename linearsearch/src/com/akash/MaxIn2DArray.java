package com.akash;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {212,44,64,53,36},
                {94,69,785},
                {3,5,8,46},
                {4,52,7,28,94,23,2}
        };
        int target = 5;
        System.out.println(search(arr));
    }
    static int search(int[][] arr){
        int max = arr[0][0];                        // OR  int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {      // We can use inhanced for loop
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}