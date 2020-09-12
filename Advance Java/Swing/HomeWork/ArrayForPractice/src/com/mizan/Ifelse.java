/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.Scanner;

/**
 *
 * @author mohdm
 */
public class Ifelse {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        if (N % 2 == 1) {
//            System.out.println("Weird");
//        } else {
//            if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N <= 20) {
//                System.out.println("Weird");
//            } else {
//                System.out.println("Not Weird");
//            }
//        }
        System.out.println(" write a number ");
        int num = in.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " but ");
        } 

    }
}
