package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp1 {

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
		         System.out.println("DB ���� ����");
		         Statement stmt = conn.createStatement();
		         
		         String sql = "create table emp1("
		         		+ "empno int, ename varchar(10), sal double)"; // ?�� �����ٰ� setInt,setString�� �� �մ°�
		         //����ǥ ������ŭ set�� �־����
		    
		         stmt.executeUpdate(sql); //�μ�Ʈ ������ �ۼ�
		         
		         
		         PreparedStatement pstmt = conn.prepareStatement(sql);
//		         pstmt.setInt(1,36); // 1�� ����ǥ �ε���, ù��° ����ǥ ��¶�
//		         pstmt.setString(2, "�ູ�� ����");
//		         pstmt.setString(3, "���ϵ� ���ǻ�");
//		         pstmt.setInt(4, 12000);
		         
//		         pstmt.executeUpdate();

		         
		         //		         pstmt.setInt(1, 36);
		         
		         ResultSet rs = pstmt.executeQuery();
//		         sql = "select * from Book";
//		         
//		         ResultSet rs = stmt.executeQuery(sql); // ResultSet���� ��� ��ȯ
	
	}catch(SQLException e){
		}
	}

}
