package com.akash.intro;

public class FiboByAkraBazzi {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(Fiboformula(i));
//    }
        System.out.println(Fiboformula(50));
        }
    static int Fiboformula(int n){
        // Just for demo use long int instead
        return (int)(Math.pow(((1+Math.sqrt(5)) / 2), n) / Math.sqrt(5));
        // This is called Golder Ratio. It is derived from Akra-Bazzi Theorem
    }
}
