package com.akash;
import java.util.Scanner;
public class NestedSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int EmpId = sc.nextInt();
        String Department = sc.next();

        switch(EmpId){
            case 1:
                System.out.println("Akash");
                break;
            case 2:
                System.out.println("Anand");
                break;
            case 3 :
                System.out.println("this is case 3");
                switch(Department){
                    case "IT":
                        System.out.println("IT Deprtment");
                        break;
                    case "Electrical":
                        System.out.println("Electrical Department");
                        break;
                }
                break;
        }
        // OR
        //Enhanced Switch :
//        switch (EmpId) {
//            case 1 -> System.out.println("Akash");
//            case 2 -> System.out.println("Anand");
//            case 3 -> {
//                System.out.println("this is case 3");
//                switch (Department) {
//                    case "IT" -> System.out.println("IT Deprtment");
//                    case "Electrical" -> System.out.println("Electrical Department");
//                }
//            }
//        }
    }
}