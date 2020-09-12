
package com.sany.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static  Connection instance;
    
    public static Connection getInstance(){
        try{
            instance=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing","root", "1234");
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println("Not Connected");
        }
        return instance;
    }
}
