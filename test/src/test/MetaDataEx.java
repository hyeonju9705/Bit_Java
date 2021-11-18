package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaDataEx {

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
	         PreparedStatement pstmt = conn.prepareStatement("select deptno, sal "
		         		+ "from emp ");
	         
	         ResultSet rs = pstmt.executeQuery();
	         ResultSetMetaData rsmd = rs.getMetaData();
             System.out.println("�÷��� ����: "+rsmd.getColumnCount());
             System.out.println("2��° �÷� �̸�: "+rsmd.getColumnName(2));
             System.out.println("2��° �÷� Ÿ��: "+rsmd.getColumnTypeName(2));
		 }catch(SQLException e) {
		       e.printStackTrace();

	}
	}

}
