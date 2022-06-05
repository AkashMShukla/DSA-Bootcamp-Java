package com.akash.arrays;
import java.util.ArrayList;
public class FindMultipleOccurence {
    public static void main(String[] args) {
        int[] arr = {4,5,6,423,78,5,2};
        FindIndex(arr, 5, 0);
        System.out.println(list);

        System.out.println(FindIndex(arr, 5, 0,new ArrayList<>()));
        //OR
        //ArrayList<Integer> list = new ArrayList<>();
        //System.out.println(FindIndex(arr, 5, 0,list));

        System.out.println(FindIndex2(arr, 5, 0));
    }
    // Way 1 :-
    static ArrayList<Integer> list= new ArrayList<>();// Here we have used this outside the recursion function
    static void FindIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(target == arr[index]){
            list.add(index);
        }
        FindIndex(arr, target, index + 1);
    }
    // Way 2 :- Use this method, This is efficient way.
    static ArrayList<Integer> FindIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        return FindIndex(arr, target, index + 1, list);
    }

    // Way 3 :-
    static ArrayList<Integer> FindIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = FindIndex2(arr,target,index+1);
        list.addAll(AnsFromBelowCalls);
        return list;
    }
}