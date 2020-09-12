package oracledbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;

public class OracleDBConn {

    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connecttion;
    private static String url = HOST + ":" + PORT + ":";

    public static Connection getOracleConnection() {
        try {
            connection = DriverManager.getConnection(url + "xe", "hr", "Apu202769000");
            System.out.println("-::Connection::-");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }

}
