/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan;

import java.util.Scanner;

/**
 *
 * @author mohdm
 */
public class LoopsOF2 {
    static int getValue(int a,int b, int n) {
    	
        int sum = a;
        for(int z=n;z>=0;z--) {
            sum = sum + ((int) Math.pow(2,z))*b;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 0;
        int a = 0;
        int b = 0;
        int n = 0;
        t = in.nextInt();
        for(int i=0;i<t;i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for(int j =0;j<n;j++) {
                System.out.print(getValue(a,b,j)+" ");
            }
            System.out.println();
        }
    }
}
