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
public class Vehicle {
    int cost=0;
    int milage=0;

    public Vehicle(int c, int m) {
        cost=c;
        milage=m;
    }
    public void vehicle_details(){
    
        System.out.println("The vehile Class");
        System.out.println("cost "+ cost);
        System.out.println("milege " +milage);
    }
}
