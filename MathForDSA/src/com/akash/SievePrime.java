package com.akash;
//This is Sieve of Eratosthenes method to check prime number in given range with more efficiency.
public class SievePrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        sieve(n,prime);
    }
    static void sieve(int n, boolean[] prime){
        for(int i = 2 ;i * i <= n;i++){ // We have to check only till the half of the size
            if(!prime[i]){  // By default, prime[i] is false
                // if prime[i] is false it means it is prime.
                for(int j = i*i;j <= n;j += i){ // We are eliminating multiples of i.
                    prime[j] = true;  // We make all the multiple of prime number true.
                    // so that It will not consider that number in next loop to check it is prime or not.
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
