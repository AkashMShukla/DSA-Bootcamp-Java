package com.akash;
import java.util.Scanner;

public class StringExample{
    public static void main(String[] args){
        String ans = greet();
        System.out.println(ans);
        //Below is by using parameter
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = sc.next();
        String result = Greeting(name);
        System.out.println(result);
    }
    static String Greeting(String name){  // By Using Parameter
        String output = "Hello "+name;
        return output;
    }
    static String greet(){
        String Greeting = "How are you !";
        return Greeting;
    }
}