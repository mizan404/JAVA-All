
package com.mizan.test;

import com.mizan.conn.DbConnection;
import java.sql.Connection;


public class Test {
    public static void main(String[] args) {
        Connection conn = DbConnection.getInstance(); 
    }
         
}
