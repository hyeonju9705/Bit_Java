package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BLOBEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
	         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottDB?useSSl=false","scott","tiger");
	         
	         PreparedStatement ps = conn.prepareStatement("insert into images values(?,?)");
	         ps.setString(1,"R");
	         FileInputStream fin = new FileInputStream("c:/temp/o.png");
	         ps.setBinaryStream(2, fin, fin.available());
	         int i=ps.executeUpdate();
	         System.out.println(i+"°³ÀÇ ·¹ÄÚµå°¡ »ðÀÔµÊ");
		 }catch(SQLException e) {
		       e.printStackTrace();

	}
	}

}
