package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class information {
	void insert(String con_no,String name,String clas,String subject,String present,String absent)
	{
	
		String db = "jdbc:mysql://localhost/3306/Attandance_System";
		String user = "root";
		String pass = "12345";
		
		try 
		{
			Connection con = DriverManager.getConnection(db, user, pass);
			Statement stmt = con.createStatement();
			
			String query = "insert into information values('"+con_no+"','"+name+"','"+clas+"','"+subject+"','"+present+"','"+absent+"')";
			
			stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "record already exist");
		}
		
		
		
	}
	


}
