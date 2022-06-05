package com.akash;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));

            if(Math.abs(root - x) < 0.5){
                // This is the error. We can take < 1 OR < 0.5 OR < 0.1. Only the steps will be increase & will go close to our answer
                // As we are moving close to the 0.
                break;
            }

            x = root;
        }
        return root;
    }
}
