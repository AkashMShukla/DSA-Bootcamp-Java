package com.akash;
// When we don't know the array is sorted in ascending order or in descending order
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {1,3,4,6,7,57,89,99};     //You can check for both Ascending & Descending Array
        int[] arr = {99,34,11,4,3,-45};
        int target = -45;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];   //You can also use below if else condition also
        /*
        if(arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
         */
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
