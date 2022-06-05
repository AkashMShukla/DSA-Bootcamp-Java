package com.akash;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array of primitives (i.e. int, char, float, boolean)
        int[] arr = new int[5];
        //Use for loop to take input & print
        System.out.println("Type 5 int values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // OR

        //The below is enhanced for loop. This will also give same output as above.
//        for (int j : arr) { //For every element in an array, print the element.
//            System.out.print(j + " "); //here num represent element of an array.
//        }

        // OR

        // Last & best way to print array :
        System.out.println(Arrays.toString(arr)); //for this you have to import Arrays.
        // This will give output in best format. using comma, brackets.

        // Array of object :
        String[] str = new String[5];
        System.out.println("Type 5 String :");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        //Modify

        str[1] = "Akash";
        System.out.println(Arrays.toString(str));

    }
}
