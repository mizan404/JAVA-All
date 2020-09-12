/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.HashMap;

/**
 *
 * @author mohdm
 */
public class JustTry4 {

    public static void main(String[] args) {
        String[] data = new String("Nothing is as easy as it looks").split(" ");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String key : data) {
            Integer freq = hm.get(key);
//            System.out.print(" "+ key);
            if (freq == null) {
                freq = 1;
            } else {
                freq++;
            }
            hm.put(key, freq);
        }
//        System.out.println(" ");
        System.out.println(hm);
    }
}
