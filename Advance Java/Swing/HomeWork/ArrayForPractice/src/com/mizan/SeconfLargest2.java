/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

/**
 *
 * @author mohdm
 */
public class SeconfLargest2 {

    public static void main(String[] args) {
        int[] a = {1, 9, 3, 16, 5, 4, 7, 8, 2};
        // For Second Largest Number
        int larest = Integer.MIN_VALUE;
        int second_larest = Integer.MIN_VALUE;
        // For  Second Smallest Number 
        int Smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;
        // For Second Largest Number 
        for (int i = 0; i < a.length; i++) {
            if (a[i] > larest) {
                second_larest = larest;
                larest = a[i];
            } else if (a[i] > second_larest && a[i] != larest) {
                second_larest = a[i];
            }
        }
        if (second_larest == Integer.MIN_VALUE) {
            System.out.println("No Socond Largest Number is here!");
        } else {
            System.out.println("Second Largest Number is " + second_larest + " ");
        }
        // For Second Smallest Number 
        for (int i = 0; i < a.length; i++) {
            if (a[i] < Smallest) {
                second_Smallest = Smallest;
                Smallest = a[i];
            } else if (a[i] < second_Smallest && a[i] != Smallest) {
                second_Smallest = a[i];
            }
        }
        if (second_Smallest == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest Number is here!");
        } else {
            System.out.println("Second Smallesr Number is " + second_Smallest);
        }
      }
}
