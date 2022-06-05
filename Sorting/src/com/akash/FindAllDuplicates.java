package com.akash;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));//At last the array looks like this
        System.out.println(sort(arr)); // index 4 th & 5 th are missing. Their must be 5 & 6 at index 4 & 5 respectively.
    }
    static List<Integer> sort(int nums[]){
        int i = 0;
        while(i < nums.length){
            int CorrectIndex = nums[i] - 1;
            if(nums[i] != nums[CorrectIndex]){
                swap(nums, i, CorrectIndex);
            }else{
                i++;
            }
        }
        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
