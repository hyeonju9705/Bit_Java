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
		         System.out.println("DB 연결 성공");
		         Statement stmt = conn.createStatement();
		         
		         String sql = "create table emp1("
		         		+ "empno int, ename varchar(10), sal double)"; // ?인 곳에다가 setInt,setString할 수 잇는것
		         //물음표 갯수만큼 set이 있어야함
		    
		         stmt.executeUpdate(sql); //인서트 쿼리문 작성
		         
		         
		         PreparedStatement pstmt = conn.prepareStatement(sql);
//		         pstmt.setInt(1,36); // 1은 물음표 인덱스, 첫번째 물음표 라는뜻
//		         pstmt.setString(2, "행복한 왕자");
//		         pstmt.setString(3, "와일드 출판사");
//		         pstmt.setInt(4, 12000);
		         
//		         pstmt.executeUpdate();

		         
		         //		         pstmt.setInt(1, 36);
		         
		         ResultSet rs = pstmt.executeQuery();
//		         sql = "select * from Book";
//		         
//		         ResultSet rs = stmt.executeQuery(sql); // ResultSet으로 결과 반환
	
	}catch(SQLException e){
		}
	}

}
