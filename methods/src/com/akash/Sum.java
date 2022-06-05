package com.akash;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        sum();
        System.out.println("The below answer is got by return type");
        System.out.println(sum2());
        System.out.println("The below answer got by Passing Parameters");
        int ans = sum3(10,21);// Note : a: & b: is  not a part of the code.
        System.out.println(ans);
    }

    // Pass the value(Parameter) of number when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No. :");
        int a = sc.nextInt();
        System.out.println("Enter First No. :");
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
    }
    static void sum(){   //It is not returning anything hence return type is void
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No. :");
        int a = sc.nextInt();
        System.out.println("Enter First No. :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is :"+sum);
    }
}