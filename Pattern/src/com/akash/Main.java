package com.akash;
public class Main {
    public static void main(String[] args) {
	// write your code here
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern28(4);
        pattern30(4);
        pattern17(4);
        pattern31Help(4);
        pattern31(4);
    }
    static void pattern1(int n){
        System.out.println("This is pattern 1");
        for(int row = 1; row <= n;row++){
            for(int col = 1; col <= n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.println("This is pattern 2");
        for(int row = 1; row <= n;row++){
            for(int col = 1; col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("This is pattern 3");
        for(int row = 1; row <= n;row++){
            for(int col = 1; col <= n+1-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("This is pattern 4");
        for(int row = 1; row <= n;row++){
            for(int col = 1; col <= row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("This is pattern 5");
        for(int row = 1; row <= 2*n-1; row++){
            int TotalColInRow = row > n ? 2*n-row : row;
            for(int col = 1; col <= TotalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        System.out.println("This is pattern 28");
        for(int row = 1; row <= 2*n-1; row++){
            int TotalColInRow = row > n ? 2*n-row : row;
            int noOfSpaces = n - TotalColInRow;
            for(int s = 1; s <= noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int col = 1; col <= TotalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        System.out.println("This is pattern 30");
        for(int row = 1; row <= n; row++){
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        System.out.println("This is pattern 17");
        for(int row = 1; row <= 2*n-1; row++){
            int c = row > n ? 2*n-row: row;
            for (int space = 1; space <= n - c; space++) {
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern31Help(int n){
        System.out.println("This is pattern before pattern 31");
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(row,col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        System.out.println("This is pattern before pattern 31");
        int originalN = n;
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row,col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
