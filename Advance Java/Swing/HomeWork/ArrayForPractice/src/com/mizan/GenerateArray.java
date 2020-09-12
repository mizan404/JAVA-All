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
public class GenerateArray {

    public static void main(String[] args) {
//        int[] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = i;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.print(" " + a[i]);

        // create a 3d array
        int[][][] test = {
            {
                {1, -2, 3},
                {2, 3, 4}
            },
            {
                {-4, -5, 6, 9},
                {1},
                {2, 3}
            }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}

