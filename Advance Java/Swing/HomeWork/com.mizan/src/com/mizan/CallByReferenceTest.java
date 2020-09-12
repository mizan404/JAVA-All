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
public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference cbr = new CallByReference(); 
        cbr.name= "Rahman";
        System.out.println("Before name: " + cbr.name);
        
        cbr.change(cbr);
        System.out.println("After name: " + cbr.name);
              
    }
}
