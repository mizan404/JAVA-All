package com.mizan;

public class FiveStar {
// Passing an object as parameter. 

    int a = 10;

    void changeObjectValue(FiveStar o) {

        o.a++;

    }

    public static void main(String[] args) {
        FiveStar fs = new FiveStar();
        System.out.println("o.a++ " + fs.a);
        fs.changeObjectValue(fs);// fs is represent changeObjectValue's "o" parameter. 
        System.out.println("o.a++ " + fs.a);

        //        int n = 5;
        //        for (int i = 0; i <= n; i++) {
        //            for (int j = 0; j < i; j++) {
        //                System.out.print("*");
        //
        //            }
        //            System.out.println("");
        //        }
    }
}
