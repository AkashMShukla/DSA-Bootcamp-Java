package com.akash;
import java.util.Scanner;
import java.util.ArrayList;
public class MultiDimesionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList();
        Scanner sc = new Scanner(System.in);

        //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
