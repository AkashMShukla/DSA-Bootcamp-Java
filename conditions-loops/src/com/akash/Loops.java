package com.akash;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        // 1. for Loop
        // Print numbers from 1 to 5
        for(int i = 1; i <= 5; i ++){
            System.out.println(i);
        }

        //Print from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num = 1; num <= n; num ++){
            System.out.print(num + ". ");
            System.out.println("Hello World"); //Print Hello World n times
        }

        // 2. while Loop
        int a = 1;
        while(a<=9){
            System.out.println(a);
            a ++;
        }

        // 3. do while Loop
        int x = 1;
        do{
            System.out.println(x);
            x ++;
        }while(x<=5);
    }
}
