/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.HashSet;

/**
 *
 * @author mohdm
 */
public class CommonElement {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 7, 9, 6, 6};
        int[] arr2 = {1, 2, 4, 6, 8, 10, 4};
        HashSet<Integer> hs = new HashSet<>();// Use HasSet to search unique common element; 
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    hs.add(arr1[i]);
                    System.out.println("Common Element is : " + arr1[i]);
                    break;
                }
            }
        }
        System.out.println("----------------------------------------");
        for (int no : hs) {
            System.out.println("Common Element is : " + no);
        }
    }
}
