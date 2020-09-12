package com.mizan.conn;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {

    private static Connection instance;

    public static Connection getInstance() {
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "12345");
            System.out.println(":::Connected:::");
        } catch (Exception ex) {
        }
        return instance;
    }
}
