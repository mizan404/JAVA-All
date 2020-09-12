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
public class findLeaderElement {

    public static void main(String[] args) {
        int[] array = {4, 7, 6, 5, 9, 8, 2, 1};
        /* 
    An element is called the leader of an array if there is no greater element on the right side.
         */
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Leader Element is: " + array[i] + " ");
            }
        }
        System.out.printf("%n");
    }
}
