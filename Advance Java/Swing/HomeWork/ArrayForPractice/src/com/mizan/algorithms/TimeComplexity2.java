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
public class TimeComplexity2 {

    public static void main(String[] args) {

//        it take o(n2) time's. 
        int n = 5, k = 1, i = 1;

        while (k < n) {
            System.out.println("How many times");
            k = k + i;
            i++;
            System.out.println(k+ " ------ "+i);
        }
    }
}
