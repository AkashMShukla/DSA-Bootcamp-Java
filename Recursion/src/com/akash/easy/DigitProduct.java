package com.akash.easy;
public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(product(1342));
    }
    static int product(int n){
        if(n == 0){   // OR if(n%10 ==n){ return n; }
            return 1;
        }
        return (n%10) * product(n/10);
    }
}
