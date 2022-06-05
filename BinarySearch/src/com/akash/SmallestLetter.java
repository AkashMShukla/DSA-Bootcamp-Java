package com.akash;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'j', 'o', 'v', 'x'};
        char target = 'o';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // We have to check only smallest character in the array that is larger than target
        //Hence here we have return this thing. If It is >= target they we had returned mid under while & start after while loop end.
    }
}