/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author mohdm
 */
public class JustTry2 {

    public static void main(String[] args) {
        /**
         * ***********************************************************************
         * Demonstrates hashCodes of various objects
         *
         ************************************************************************
         */

        Integer obj1 = new Integer(2009);
        System.out.println("hashCode for an integer " + obj1.hashCode());

        String obj2 = new String("2009");
        System.out.println("\nhashCode for a string " + obj2.hashCode());

        StringBuffer obj3 = new StringBuffer("2009");
        System.out.println("\nhashCode for a string buffer " + obj3.hashCode());

        ArrayList<Integer> obj4 = new ArrayList<Integer>();
        obj4.add(new Integer(2009));
        System.out.println("\nhashCode for an arraylist " + obj4.hashCode());

        Iterator obj5 = obj4.iterator();
        System.out.println("\nhashCode for an iterator " + obj5.hashCode());

        JustTry2 obj6 = new JustTry2();
        System.out.println("\nhashCode for HashCodeDemo " + obj6.hashCode());

        String obj7 = new String("19999999999999999");
        System.out.println("\nhashCode can be negative " + obj7.hashCode());
    }
}
