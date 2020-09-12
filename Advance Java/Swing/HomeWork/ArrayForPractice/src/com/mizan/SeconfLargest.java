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
public class SeconfLargest {

    public static void main(String[] args) {
        int[] a = {1, 9, 3, 6, 5, 4, 7, 8, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
//                if (a[i]> a[j]) { /*       for Second Smallest Number       */

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
//            if (i == 1) {
//                /*            to stop untill not get the secont largest or smallest number        */
//                break;
//            }

        }
        for (int i = 0; i < a.length; i++) {
            /*            for sort array      */
            System.out.print(a[i] + " ");

        }
        System.out.println("Second Largest Number Is " + a[1]);
    }
}
