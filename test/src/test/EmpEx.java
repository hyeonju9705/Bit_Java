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
		System.out.println("사번, 이름, 월급 순서로 입력하시오 >> ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   try {
		         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottDB?useSSl=false","scott","tiger");
		         System.out.println("DB 연결 성공");
		         Statement stmt = conn.createStatement();
		         
		         String sql = String.format("insert into emp1 (empno, ename, sal) values (%d, '%s', %d)", 
		        		 scan.nextInt(), scan.next(), scan.nextInt());
		         stmt.executeUpdate(sql); //인서트 쿼리문 작성
		         
		         //sql = "사번, 이름, 월급 순서로 입력하시오(?, ?, ?)"; // ?인 곳에다가 setInt,setString할 수 잇는것
		         //물음표 갯수만큼 set이 있어야함
		         PreparedStatement pstmt = conn.prepareStatement(sql);
		         
		         ResultSet rs = pstmt.executeQuery();

		         System.out.println("정보가 추가되었습니다.");
		         System.out.println("입력을 계속하시겠습니까? (y/n)");
		         
		         String result =scan.next();
		         if("n".equals(result))
		        	 break;
		      }catch(SQLException e) {
		       e.printStackTrace();

	}
		}
	}

}
