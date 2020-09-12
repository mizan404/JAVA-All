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
public class MissingElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        // WAY 1: 
        int expected_no_elements = a.length + 1;
        int total_sum = expected_no_elements * (expected_no_elements + 1) / 2;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Missing Element is : " + (total_sum - sum));
        System.out.println("---------------------------");

        // WAY 2: 
        int xor1 = a[0];
        for (int i = 1; i < a.length; i++) {
            xor1 = xor1 ^ a[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= a.length + 1; i++) {
            xor2 = xor2 ^ i;

        }
        System.out.println("Missing Element is : " + (xor1 ^ xor2));

    }
}
