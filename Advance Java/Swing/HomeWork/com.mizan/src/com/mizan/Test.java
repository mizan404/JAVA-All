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
public class Test {

    private String color;
    int age;
    int number;

     protected Object initObj(String c) {
        color = c;
        return null;
        

    }

    void display() {
        System.out.println(color + " " + age+" "+number);
    }

//    public static void main(String[] args) {
//        Test birds = new Test();
//        birds.initObj("Black", 10);
//        birds.display();
//    }

    
}
