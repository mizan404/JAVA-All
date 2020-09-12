/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.algorithms;

/**
 *
 * @author mohdm
 */
public class RecurrenceRelation {
    
    public static void main(String[] args) {
//        Test(3);
//        TestTwo(3);
//        TestThree(5);
//        TestFour(5);
//        TestFive(6);
        TestSix(6);
        
    }

//    public static void Test(int n) {
//        if (n > 0) {
//            System.out.printf("%d ", n);
//            Test(n - 1);
//            System.out.println("----------------------------");
//        }
//    }
//    public static void TestTwo(int m) {
//        if (m > 0) {
//            for (int i = 0; i < m; i++) {
//                System.out.printf("%d ", m);
//            }
//
//            TestTwo(m - 1);
//        }
//    }
//    public static void TestThree(int m) {
//        if (m > 0) {
//            for (int i = 1; i < m; i = i * 2) 
//                System.out.printf("%d ", i);
//            }
//
//            TestThree(m - 1);
//        }
//    }
//    public static void TestFour(int m) {
//        if (m > 0) {
//
//            System.out.printf("%d ", m);
//
//            TestFour(m - 1);
//            TestFour(m - 1);
//        }
//    }
//    public static void TestFive(int m) {
//        if (m > 1) {
//            
//            System.out.printf("%d ", m);
//            
//            TestFive(m / 2);
//            
//        }
//    }
    
    public static void TestSix(int m) {
        if (m > 1) {
            for (int i = 0; i < m; i++) {
                System.out.printf("%d ", m);
            }
        }
        
        TestSix(m / 2);
        TestSix(m / 2);
        
    }
}
