/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.sololearn;

/**
 *
 * @author mohdm
 */
public class A extends Thread {

    public void run() {
        Thread t = new Thread(new B());
        t.start();
        System.out.println("A");
        
    }

    public static void main(String[] args) {
        A object = new A();
        object.start();
    }

}
