package com.akash;

public class conditionals {

    public static void main(String[] args) {
	// write your code here
        int salary = 25400;
//        if (salary> 10000){
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }
//        System.out.println(salary);

        //Multiple if else
        if(salary <= 20000){
            salary += 2000;
        }else if(salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
