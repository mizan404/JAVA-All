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
public class KthNumber {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 3, 8, 2, 9, 4, 8, 7};
        int k = 4;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            if (i == k - 1) {
                System.out.println(a[i] + " ");
                break;
            }
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
