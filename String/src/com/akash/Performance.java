package com.akash;
// Very important for coding round
public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            //System.out.println(ch); //We can print like this.
            series = series + ch; // or we can add in string series.
        }
        System.out.println(series);
    }
}
