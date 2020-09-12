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
public class Toyata extends Car {
    String model="";

    public Toyata(int c, int m, String col, int t, String mod) {
        super(c, m, col, t);
        model=mod; 
    }

   
    public void toyata_details() {
        System.out.println("The toyata class");
        System.out.println("Model "+ model);
    }
    
    


}
