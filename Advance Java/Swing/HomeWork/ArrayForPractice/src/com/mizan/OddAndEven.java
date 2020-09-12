/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.ArrayList;

/**
 *
 * @author mohdm
 */
public class OddAndEven {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 8, 2, 10};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }
        int total1 = 0, total2 = 0;
        System.out.println("Even Numbers are: ");
        for (int no : al1) {
            total1 = total1 + no;
            System.out.print(no + " ");
        }
        System.out.println("Number of Even are : " + al1.size());
        System.out.println("Total of Even Elements is: " + total1);
        System.out.println("---------------------------------- ");

        System.out.println("Odd Numbers are: ");
        for (int no1 : al2) {
            total2 = total2 + no1;
            System.out.print(no1 + " ");
        }
        System.out.println("Number of Odd are : " + al2.size());
        System.out.println("Total of Odd Elements is: " + total2);
        System.out.println(" ");
    }
}
