/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.ArrayList;

/**
 *
 * @author mohdm
 */
public class CommonElementThreeArray {

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 8, 9};
        int[] a2 = {1, 2, 4, 6, 7, 8, 10};
        int[] a3 = {1, 4, 7,};
        int x = 0, y = 0, z = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (x < a1.length && y < a2.length && z < a3.length) {
            if (a1[x] == a2[y] && a2[y] == a3[z]) {
                al.add(a1[x]);
                x++;
                y++;
                z++;
            } else if (a1[x] < a2[y]) {
                x++;
            } else if (a2[y] < a3[z]) {
                y++;
            } else {
                z++;
            }

        }
        for (int no : al) {
            System.out.println("Common Element in Three Sorted Array : " + no);
        }

    }
}
