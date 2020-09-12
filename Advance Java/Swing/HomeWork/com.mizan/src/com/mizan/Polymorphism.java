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
public class Polymorphism {
    void show(int a){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Polymorphism pl = new Polymorphism();
        pl.show();
        pl.show('a');
    }
}
