package com.mizan;

import java.util.Scanner;

public class InsertAnElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        System.out.println("Position for element: ");
        int pos = input.nextInt();
        System.out.println("Element value: ");
        int element = input.nextInt();
        for (int i = a.length; i < pos - 1; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = element;
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
