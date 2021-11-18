package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BLOBEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
	         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottDB?useSSl=false","scott","tiger");
	         
		 }catch(SQLException e) {
		       e.printStackTrace();

	}
	}

}
