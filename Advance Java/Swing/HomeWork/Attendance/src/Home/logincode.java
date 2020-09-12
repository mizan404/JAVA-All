package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class logincode {
	void log(String name,String password)
	{
	
		String db = "jdbc:mysql://3306/Attandance_System";
		String user = "root";
		String pass = "12345";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query= "select * from login where name= ('"+name+"') and password= ('"+password+"')";
			
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()){
				
				tab obj=new tab();
				obj.setVisible(true);	
			}
			else
				JOptionPane.showMessageDialog(null, "Wrong Password or user name");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
