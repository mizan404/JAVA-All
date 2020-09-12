/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mohdm
 */
public class AsListDemo {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println("List1 = "+ list1);
        
        String[] str = {"E","F","G"};
        List<String> list2= Arrays.asList(str);
//        list2.add("G");
        System.out.println("list2 = "+ list2);
        
        
    }
}
