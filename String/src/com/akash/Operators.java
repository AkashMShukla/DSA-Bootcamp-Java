package com.akash;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //ASCII value : a-97,z-122,A-65,Z-90
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        // This is same as after a few steps : ("a" + "1")
        // integer will be converted to Integer that will call toString()
        System.out.println("Akash" + new ArrayList<>());//It will convert ArrayList into string
        System.out.println("Akash" + new Integer(54));//It will convert Integer into String

        //System.out.println(new ArrayList<>() + new Integer(54));// This will give you error.
        //Because both are complex object. We need at least one should be string.
        System.out.println(new ArrayList<>() +""+ new Integer(54));
        //We can do one thing, we can add empty string. It is fine.
        //+ in Java, you can only use with primitives & only use with all the complex objects as well
        //but the only condition is at least one of these object should be of type string.
    }
}
