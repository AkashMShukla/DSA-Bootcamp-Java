package com.akash.easy;
public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        funRev(5);
        funBoth(5);
        concept(5);
    }
    static void fun(int n){ // Nto1
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){ // 1toN
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){ // 1 to N then N to 1
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    static void concept(int n){ //concept of --n & n--
        if(n ==0){
            return;
        }
        System.out.println(n);
        //concept(n--); //This will give you stackoverflow. This will print only 5 infinite times, because we are calling first.
        concept(--n);
    }
}