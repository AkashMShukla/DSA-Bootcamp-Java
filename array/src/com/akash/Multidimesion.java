package com.akash;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimesion{
    public static void main(String[] args){
//        int[][] arr = new int[3][];
        Scanner sc = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3}, //0th Index
//                {4,5},   //1st Index
//                {6,7,8,9}//3rd Index  arr2D[2]={6,7,8,9}
//        };

        //Input
        int[][] arr = new int[3][4];
        System.out.println(arr.length); // == no of rows

        for(int row = 0; row<arr.length;row++){
            //for each col in every row
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        //output

        for(int row = 0; row<arr.length;row++){
            //for each col in every row
            for(int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

         // OR

        // output
        for(int row = 0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //OR
        //output

        for(int[] a : arr){                //Enhanced for loop
            System.out.println(Arrays.toString(a));
        }
    }
}