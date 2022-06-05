package com.akash;
import java.util.Arrays;
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {4,6,6,6,6,6,7,9,23,67,88};
        int target = 6;
        int[] ans = (searchRange(nums, target));
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};  //If we didn't find first or last position then return {-1,-1}
        ans[0] = search(nums, target, true); // we have to find first position  // This will take logN time
        if(ans[0] != -1){  // If we get -1 for first position then we will not check for last position.
            ans[1] = search(nums, target, false);// we have to find last position // This will take logN time
            //log N + log N = 2log N = log N // Constant doesn't matter in time complexity
        }
        return ans;
    }
    // Thw below binary loop will run two times. Because we are calling it two times
    // One for finding first position & second for finding last position.
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                ans = mid;  // This is our potential answer
                // There might be more target number on left side or on right side.
                if(findStartIndex){  // If we are finding First position
                    end = mid - 1;
                }else{                // If we are finding last position
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
