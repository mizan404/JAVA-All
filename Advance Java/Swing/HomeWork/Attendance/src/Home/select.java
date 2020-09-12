package Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;





public class select {
	
	void selection(String con_no)
	{
	
		String db = "jdbc:mysql://localhost/3306/Attandance_System";
		String user = "root";
		String pass = "12345";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "select * from information where con_no ="+ con_no;
			
			ResultSet rs = stmt.executeQuery(query);
			
			if(!rs.next())
				JOptionPane.showMessageDialog(null, "No Record Found");
			else {
				tab.textField_14.setText(rs.getString(2));
				tab.textField_15.setText(rs.getString(3));
				tab.textField_16.setText(rs.getString(4));
				tab.textField_17.setText(rs.getString(5));
				tab.textField_18.setText(rs.getString(6));
				
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
		
		




