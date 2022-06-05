package com.akash;
public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println((Setbits(n)));
    }
    static int Setbits(int n){
        int count = 0;
//        while(n > 0){
//            count ++;
//            n -= (n & -n);
//        }
        while(n > 0){
            count ++;
            n -= (n & -n);
        }
        return count;
    }
}
