/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohdm
 */
public class DBConnection {

    private static Connection instance;

    public static Connection getConnection() {
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/vote_management", "root", "12345");

        } catch (SQLException ex) {
        }
        return instance;
    }
}
