package com.mizan;

import java.util.HashSet;

public class FirstDublicateElement {

    public static void main(String[] args) {
        int[] a = {2, 6, 1, 4, 7, 3, 7, 3, 7, 2, 4, 9, 8};
        // WAY 1: 
        for (int i = 0; i < a.length - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    System.out.println("First Dublicate Element is : " + a[i]);
                    temp = +1;
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }
        System.out.println("---------------------------------------");
        // WAY 2: This is more efficient way to find dublicate element. 
        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (hs.contains(a[i])) {
                temp = i;
            } else {
                hs.add(a[i]);
            }
        }
        if (temp != -1) {
            System.out.println("First Dublicate Element is : " + a[temp]);
        } else {
            System.out.println("No Dublicate Element is found");
        }
    }
}
