package com.akash;
public class Comparison {
    public static void main(String[] args) {
        String a = "Akash";
        String b = "Akash";
        //We kow that the object is in string pool. But what is the proof. So we can use ==
        System.out.println(a==b); //It will give u true, because the objects are same.
        //This is true because it is pointing to same object & values are same.

        String name1 = new String("Akash");
        String name2 = new String("Akash");// Here we have created new object. Both are outside pool.But in Heap
        System.out.println(name1 == name2);//This will give u false, because both are different object.
        // == checks both the reference variable are pointing to same object or not & also values.
        // If it is pointing to same object & values are same then only it will give true.
        System.out.println(name1.equals(name2));//It will give true because it checks only value.
        //If the values are same then it will give true.
    }
}
