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
public class Car extends Vehicle {

    String color = " ";
    int tyres = 0;

    public Car(int c, int m, String col, int t) {
        super(c, m);
        color = col;
        tyres = t;

    }

    public void car_details() {

        System.out.println("The Car Class");
        System.out.println("Color " + color);
        System.out.println("Tyres " + tyres);
    }
}
