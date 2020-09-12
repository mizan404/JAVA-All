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
public class nonstaticANDnonvoid {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        nonstaticANDnonvoid nsnv = new nonstaticANDnonvoid();
        System.out.println("   " + nsnv.add(x, y));

        //-----------------------------------
//        int min = 1;
//        int max = 10;
//        int number = getRandomNumber(min, max);
//        System.out.println(number);
//        
//        int i = (int) Math.random() * 10;
//        System.out.println("" + i);

    }

//    public static int getRandomNumber(int min, int max) {
//        return (int) (Math.random() * (max - min + 1)) + min;
//    }
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }

}
