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
public class LongestConsecutive {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 8, 10, 11};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);

        }
        int long_lang = 0;
        for (int i = 0; i < a.length; i++) {
            if (!hs.contains(a[i] - 1)) {
                int no = a[i];
                while (hs.contains(no)) {
                    no++;
                }
                if (long_lang < no - a[i]) {
                    long_lang = no - a[i];
                }
            }

        }
        System.out.println("Longest COnsecutive Sequence is : " + long_lang);
    }
}
