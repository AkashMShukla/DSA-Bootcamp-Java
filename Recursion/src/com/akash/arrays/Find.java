package com.akash.arrays;
public class Find {
    public static void main(String[] args) {
        int[] arr = {54,67,7,3,98,23};
        //To check the target is present or not :-
        System.out.println(IsNumberFound(arr,7,0));
        //To get index value of the target value :-
        System.out.println(FindIndex(arr,7,0));
                   //OR
        System.out.println(FindIndexFromLast(arr,7,arr.length-1));
    }
    // To check target is present or not
    static boolean IsNumberFound(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || IsNumberFound(arr,target,index + 1);
    }

    //To return index value of that target value

    static int FindIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return FindIndex(arr,target,index + 1);
    }

    //To return index value of that target value. Search from Last index
    static int FindIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return FindIndexFromLast(arr,target, index - 1);
    }
}
