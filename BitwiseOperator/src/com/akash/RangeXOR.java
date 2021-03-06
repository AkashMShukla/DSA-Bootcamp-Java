package com.akash;

public class RangeXOR {
    public static void main(String[] args) {
        // range XOR for a,b = XOR(b)^ XOR(a-1)
        int a = 3;
        int b = 9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        int ans2 = 0;
        //only for check, will give TLE for large numbers
        for (int i = a; i <= b; i++) {
            ans2 ^=i;
        }
        System.out.println(ans2);
    }

    //This gives XOR from 0 till a
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a+1;
        }
        return 0;
    }
}
