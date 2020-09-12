/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author mohdm
 */
public class justTry3 {

    public static void main(String[] args) {
        /**
         * ***********************************************************************
         * Demonstrates working with Hashsets
         *
         ************************************************************************
         */
        String[] words = new String("Nothing is as easy as it looks").split(" ");

//        HashSet<String> hs = new HashSet<String>();
//
//        for (String x : words) {
//            hs.add(x);
//        }
//
//        System.out.println(hs.size() + " distinct words detected.");
//        System.out.println(hs);
//
//        System.out.println("---------------------------------------");
//
        String[] colors = {"white", "pink", "red", "green", "red", "orange", "Aa", "BB"};

        HashSet<String> hs = new HashSet<String>();

        for (int i = 0; i < colors.length; i++) {
            hs.add(colors[i]);
        }

        System.out.println(hs);

        System.out.println("Does it contain green?  " + hs.contains("green"));

        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        for (String str : hs) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

}
