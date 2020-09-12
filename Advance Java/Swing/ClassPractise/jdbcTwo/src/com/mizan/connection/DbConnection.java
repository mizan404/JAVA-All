/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Students
 */
public class DbConnection {
    private static Connection instance; 
    public static Connection getInstance(){
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "12345"); 
            System.out.println("::::Connected::::");
        } catch (Exception e) {
        e.printStackTrace();
        }
    return instance;
    
    }
}
