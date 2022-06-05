package com.akash;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums ={23,452,0,754,21,-53,645864};
        System.out.println(findNumbers(nums));
//        System.out.println(digits2(-6698));  //We can also directly count the digits of any number by using digits as well.
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num = 0; num<nums.length; num++){
            if(even(nums[num])){
               // OR
        //for(int num : nums)
        //if (even(num))
                count++;
                }
            }
        return count;
        }
    static boolean even(int num){
        int numberOfDigits = digits(num);     // we can use digits2 here.
        return numberOfDigits % 2 == 0;
    }
    /*
    // The below digits2 method is fastest method to calculate number of digits in a number.
    static int digits2(int num){   // This is more optimised than below digits method.
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
     */
     //  OR
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count ++;
            num = num/10;  //  num /= 10
        }
        return count;
    }
}
