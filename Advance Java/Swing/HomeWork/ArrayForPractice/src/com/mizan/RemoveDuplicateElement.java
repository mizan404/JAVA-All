package com.mizan;

import java.util.HashSet;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
//        1. Sorted Array 
        int[] a = {1, 2, 2, 3, 4, 5, 5, 6};
        int[] temp = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j] = a[i];
                j++;
            }
        }
        temp[j] = a[a.length - 1];
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" " + temp[i]);
        }
//        ----------------------------------------------
        System.out.printf("%n");
        System.out.println("       ------------------------");

        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[k] = a[i];
                k++;
            }
        }
        a[k] = a[a.length - 1];
        for (int i = 0; i < k; i++) {
            System.out.print(" " + a[i]);
        }

//        --------------------------------------------
        System.out.printf("%n");
        System.out.println("       ------------------------");

//        2. Unsorted Array
        int[] a1 = {2, 4, 1, 7, 3, 8, 1, 8, 2, 9, 2, 5, 1, 7, 3,};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            hs.add(a1[i]);

        }
        for (int no : hs) {
            System.out.print(" " + no);

        }
        System.out.printf("%n");
    }
}
