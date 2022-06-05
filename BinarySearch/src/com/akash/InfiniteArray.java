package com.akash;
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};  // We are finding target element from Infinite Array set.
        // We are not using arr.length. So this implies that we are finding in Infinite Array
        int target = 90;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){ //This will give our start & end
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2; // end = previous end + (size of box * 2)
            start = temp;
        }
        return binarySearch(arr, target, start, end); // Then we will call the binary function by passing start & end
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}