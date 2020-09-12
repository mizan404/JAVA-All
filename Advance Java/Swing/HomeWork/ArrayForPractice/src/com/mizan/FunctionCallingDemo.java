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
public class FunctionCallingDemo {

    static int sum(int num1, int num2) {// formal parameter(Called method)
        int add = num1 + num2;
        return add;
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c;
        c = sum(a, b);
        System.out.println("" + c);// actual parameter(calling method)
    }
}
