package com.akash;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if ( a == 10){
            System.out.println("Hello World !!!");
        }

        int count = 1;
        while (count != 5) {  //When we don't know how many time loop have to run
            System.out.println(count);
            count++;
        }

        for(int i = 1; i != 5; i++){ //When we know how many time loop have to run
            System.out.println(i);
        }
    }
}
