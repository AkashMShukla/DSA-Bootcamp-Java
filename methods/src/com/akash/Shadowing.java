package com.akash;
public class Shadowing{
    static int x = 90; //Anything you want to use in main function, you have to make it as static.
    //This will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);
        int x;// the class variable at line 3 is shadowed by this.
//        System.out.println(x);//scope will begin when value is initialised.
        //This line will give error. We can print x after initialising x.
        x  = 45;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);//Here it is going to print 90 because 45 can't accessible in this scope.
    }
}