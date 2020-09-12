package com.mizan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohdm
 */
public class Demo {
    public static void main(String[] args) {
        int[][] myArray= {{1,2,3},{4,5,6}};
        char[] yourArray= {'A', 'B','C'};
        int x = myArray[1][1];
//        System.out.println(x+ " ");
char y = yourArray[0];
int z= x+y;
        System.out.println(z+" ");
        
        
        int a = -4; 
        System.out.println(a>>1);
        int a1 = 4; 
        System.out.println(a1>>1);
    }
}
