package com.akash;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	// write your code here
        // Syntax :
        // datatype[] variable_name = new datatype[size]
        int[] ros;
        ros = new int[5];
        System.out.println(ros[1]); //This will give 0 in output.

        String[] arr = new String[4];
        System.out.println(arr[3]); //The output will be null (literal)
    }
}
