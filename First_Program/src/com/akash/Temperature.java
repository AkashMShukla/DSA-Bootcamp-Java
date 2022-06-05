package com.akash;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Degree Celcius : ");
        float Cel = sc.nextFloat();
        float Far = ( Cel * 9/5 ) + 32;
        System.out.println("Temperature in Faranide is :" + Far);
    }
}
