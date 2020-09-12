/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.sololearn;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author mohdm
 */
public class DemonThread {
     public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("I'm a demon thread and I'm running!");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new AssertionError(e);                    
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
 
        System.out.println("Main Thread! is running!");
 
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new AssertionError(e);                    
        }
        System.out.println("Main thread! still running!");
        System.out.println("Main Thread is going to stop now!");
    }
}
