/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.algorithms;

/**
 *
 * @author mohdm
 */
public class TimeComplexity1 {

    public static void main(String[] args) {

//        it take o(n2) time's. 
        int n = 5, p = 0;

        for (int i = 1; p < n; i = i * 2) {
            p++;
            System.out.println("  p  " + p);
            System.out.println("  i  " + i);
        }
        for (int j = 1; j < p; j = j * 2) {
            System.out.println("How many times");
            System.out.println("     " + j);
        }
    }
}
