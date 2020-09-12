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
public class Test1 extends Test{
String name;
int run; 


    @Override
    void display(){
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String initObj(String c) {
        super.initObj(c); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

  
    public static void main(String[] args) {
        Test birds = new Test();
        birds.initObj("a");
        birds.display();
        Test1 birdss= new Test1();
        birdss.initObj("B");
        birdss.display();
       
    }
}
