package com.akash;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // The below is block scope.
        {
//            int a = 23; //already initialised outside the  block in the same method.
            // Hence you can not initialise again.
            a = 33;//reassign the original ref. variable to some other value.
            System.out.println(a);
            int c = 34;//values initialised in the block will remain in block.
        }
        int c = 24; //We can reinitialise outside the block
        System.out.println(a);
//        System.out.println(c);//can not use outside the block

        //Scoping in for loop :
        for(int i =0;i<4;i++){
            System.out.println(i);
//            int a = 45//We can't initialised because it is already initialised outside the block.
            a = 3435; //We can change the value.
        }
//        System.out.println(i);//We can't use i outside the for loop
    }
}
