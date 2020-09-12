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
public class JavaStdinAndStdout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        
        String s = sc.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}
