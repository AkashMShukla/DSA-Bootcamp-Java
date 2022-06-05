package com.akash;
import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Q. Find the Largest of three Number

        //First Way :-
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        //Second Way :-
//        int max = 0;
//        if(a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

        // Third Way :-
        // Most Efficient Way
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
     }
}