package com.akash;
import java.util.Scanner;
public class Questions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println("The given number is Prime ?");
        System.out.println(ans);
        System.out.println("The given number is armstrong ?");
        System.out.println(isArmstrong(n));
        // To print all 3 digit Armstrong Numbers
        System.out.print("Three digits Armstrong numbers are : ");
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // Armstrong Number
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }

    // Is Prime or not
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}