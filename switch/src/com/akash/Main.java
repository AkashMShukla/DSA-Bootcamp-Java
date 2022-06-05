package com.akash;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1 :
//        String fruit = sc.next();
        // Way 1 : Normal Switch
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red Fruit");
//                break;
//            case "Orange":
//                System.out.println("Round Fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
        // OR

                //The above switch is normal switch. We can enhance the switch.
                //Go to switch word & type, Altr + Enter. You can see option of Enhance Switch.
                //Then the above switch will be converted into the following simple switch code.
        // Way 2 : Enhanced Switch
//        switch (fruit) { // This is enhanced switch case.
//             case "Mango" -> System.out.println("King of Fruits");
//             case "Apple" -> System.out.println("A sweet red Fruit");
//             case "Orange" -> System.out.println("Round Fruit");
//             default -> System.out.println("Please enter a valid fruit");

        int day = sc.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
                // OR
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
        }
    }
}