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
public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue cbv= new CallByValue();
        int a=10;
        System.out.println("a ="+ a);
        
        cbv.change(a);// a is actual paremetre
        System.out.println("i =" + a);
    }
}
