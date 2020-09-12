/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.test;

import com.mizan.connection.DBConnection;
import java.sql.Connection;

/**
 *
 * @author mohdm
 */
public class test {

    public static void main(String[] args) {
        Connection connect = DBConnection.getConnection();
        System.out.println("Connected");
    }
}
