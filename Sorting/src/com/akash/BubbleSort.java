package com.akash;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,8,1,-6,0,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length - 1;i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j = 1; j < arr.length - i; j++){  //or j <= arr.length - i -1
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //If you did not swap for a particular value of i, it means the array is sorted hence stop the program.
            if(!swapped){ // !false = true. We can also use swapped == false ....
                break;
            }
        }
    }
}
