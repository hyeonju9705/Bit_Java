package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("���, �̸�, ���� ������ �Է��Ͻÿ� >> ");
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
		         
		         String sql = String.format("insert into emp1 (empno, ename, sal) values (%d, '%s', %d)", 
		        		 scan.nextInt(), scan.next(), scan.nextInt());
		         stmt.executeUpdate(sql); //�μ�Ʈ ������ �ۼ�
		         
		         //sql = "���, �̸�, ���� ������ �Է��Ͻÿ�(?, ?, ?)"; // ?�� �����ٰ� setInt,setString�� �� �մ°�
		         //����ǥ ������ŭ set�� �־����
		         PreparedStatement pstmt = conn.prepareStatement(sql);
		         
		         ResultSet rs = pstmt.executeQuery();

		         System.out.println("������ �߰��Ǿ����ϴ�.");
		         System.out.println("�Է��� ����Ͻðڽ��ϱ�? (y/n)");
		         
		         String result =scan.next();
		         if("n".equals(result))
		        	 break;
		      }catch(SQLException e) {
		       e.printStackTrace();

	}
		}
	}

}
