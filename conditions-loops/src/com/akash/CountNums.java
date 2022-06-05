package com.akash;
import java.util.Scanner;
public class CountNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        int number = n; //To use the original number in last print. We are storing it in another variable.
        System.out.println("Counting Occurence of :");
        int occurence = sc.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if ( rem == occurence){
                count++;
            }
            n = n/10; // We cal also write like,  n /= 10
        }
        System.out.println("In "+number+", "+occurence+" comes "+count+" times.");
    }
}