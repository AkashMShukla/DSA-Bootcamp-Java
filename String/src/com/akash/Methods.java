package com.akash;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Akash Shukla";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty());
        System.out.println(name);//Original String is not going to change. because we know that strings are immutable
        //Original String will remain same at last.
        System.out.println(name.indexOf('s'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
