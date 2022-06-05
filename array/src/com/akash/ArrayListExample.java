package com.akash;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(23);
        list.add(74);
        list.add(463);
        list.add(974);
        list.add(9);

        System.out.println(list);
        System.out.println(list.contains(23));
        list.set(0,99);
        list.remove(2);
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
