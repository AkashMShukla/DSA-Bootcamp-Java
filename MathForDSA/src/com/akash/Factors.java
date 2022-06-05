package com.akash;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(20);
        factors3(20);
    }

    //Complexity :- O(n)
    static void factors1(int n){
        for(int i = 1; i <= n;i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void factors2(int n) { // Complexity :- O(Sqrt(n))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) { //Exceptional case, e.g: 36 : 6*6, 6*6 This will duplicate.
                    System.out.println(i); //Therefore, print 6 only one time. To avoid duplicate values we use this case.
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
                // This is giving output but it is not in ascending order. So we can kept this n/i in another list.
                //Because i is in order 1,2,4. But n/i is not 20,10,5
            }
        }
        System.out.println();
    }
    static void factors3(int n){ // Complexity :- O(Sqrt(n))
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " "); //This will print 1 2 4
                    list.add(n/i); //In Array list. It is in Descending order like 20 10 5
                }
            }
        }
        for(int i = list.size() - 1; i >= 0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
