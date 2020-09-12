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
public class TimeComplexity3 {

    public static void main(String[] args) {
        test(3);
    }

    static void test(int n) {
        if (n > 5) {
            System.out.printf("%d", n);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.printf("%d", i);

            }
        }
    }
}
