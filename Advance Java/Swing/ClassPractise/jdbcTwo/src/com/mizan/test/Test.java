/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.test;

import com.mizan.connection.DbConnection;
import com.mizan.pojo.Catagory;
import com.mizan.service.CommonService;
import com.mizan.servicepojo.CatagoryServiceImpl;
import java.sql.Connection;

/**
 *
 * @author Students
 */
public class Test {
    public static void main(String[] args) {
//        Connection con = DbConnection.getInstance(); 
        CommonService inService = new CatagoryServiceImpl(); 
//        inService.createTable();
        //////////Save/////////
        Catagory s1 = new Catagory("Mizan", "OK"); 
        inService.save(s1);
        Catagory s2 = new Catagory("Mizan", "OK........"); 
        inService.save(s2);
        Catagory s3 = new Catagory("Mizan", "OKKKKKKKKK"); 
        inService.save(s3);
        Catagory s4 = new Catagory("Mizan", "OKKKKKKKKKKKKK"); 
        inService.save(s4);
    }
}
