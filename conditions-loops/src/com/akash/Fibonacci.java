package com.akash;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("The " + n + "th index is : "+ b);
    }
}