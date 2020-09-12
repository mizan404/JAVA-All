package com.mizan;

import java.util.Scanner;

public class DeleteElement {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.print("Before delete element ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Delete value for element: ");
        int delete = input.nextInt();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (delete == a[i]) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element delete successfully");
            for (int i = 0; i < a.length - 1; i++) {
                System.out.print(" " + a[i]);
            }
        }
    }
}
