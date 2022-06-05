package com.akash;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //Type Casting
        int num1 = (int)(45.64f);
        System.out.println(num1);

        //Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte)(a);// 257 % 256 = 1
        System.out.println(b);

        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;
        int d1 = a1 * b1 / c1;//Even though a1,b1,c1 are byte. the Expression is performed in integer
        System.out.println(d1);// Promoting each byte to integer while evaluating expression

        //byte x = 50;
        //x = x * 2; //This will give error.Because This expression is now int. & we are assigning int to byte.
        //which is not possible without explicit Casting

        int number = 'A';
        System.out.println(number);// Automatic Type Conversion (ASCII Value)

        System.out.println("नमस्ते"); //Java follows Unicode. Means we can print any language.

        //Let's Revise in one example:
        byte t = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*t)+(i/c)-(d*s);
        //float + int  - double = double
        System.out.println((f*t) + "  " + (i/c) + "  " + (d*s));
        System.out.println(result);
    }
}
