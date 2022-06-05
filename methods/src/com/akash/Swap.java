package com.akash;

public class Swap{
    public static void main(String[] args){
        String name = "Akash";
        changeName(name);
        System.out.println(name);
        int a = 3;
        int b = 2;
        swap(a,b);
        System.out.println(a+" "+b);//It will not swapped by the swap method(function)
    }
    static void changeName(String naam) {
        naam = "Ram"; //We are creating a new object.
    }
    static void swap(int a, int b){ //This will not swap the original a & b value.
        int temp = a;
        a = b;
        b = temp;
        //This change will only be valid in this function scope only.
    }

}