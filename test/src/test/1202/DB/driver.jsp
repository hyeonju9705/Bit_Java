<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.io.*,java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String url="jdbc:mysql://localhost:3306/scottDB?useSSL=false";
String dbId="scott",dbPwd="tiger";
Connection conn=null;
String sql=null;
PreparedStatement pstmt = null;
ResultSet rs= null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection(url,dbId,dbPwd);
	/* out.println("데이터베이스 연결 성공"); */
	sql="SELECT * FROM BOOK";
	pstmt = conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	/* select문만 executeQuery() */
	out.print("<table border='1'><tr><th>BOOKID</th><th>BOOK NAME</th><th>PUBLISHER</th><th>PRICE</th></tr>");
	while(rs.next()){
	out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	}
	out.print("</table>");
	
	out.print("테이블 수정해볼께");
	sql="update book set price = '600' where bookname like '%현주%'";
	pstmt = conn.prepareStatement(sql);
	pstmt.executeUpdate();
	/* update,delete이런거는 다 executeUpdate() 근데 executeUpdate는 rs에 담아주지 않음!!** */
	sql="SELECT * FROM BOOK";
	pstmt = conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	/* select문만 executeQuery() */
	out.print("<table border='1'><tr><th>BOOKID</th><th>BOOK NAME</th><th>PUBLISHER</th><th>PRICE</th></tr>");
	rs=pstmt.executeQuery();
	while(rs.next()){
	out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	}
	out.print("</table>");
	
	out.print("데이터 삭제해볼꼐");
	sql="delete from book where bookname= '%dddd%'";
	pstmt = conn.prepareStatement(sql);
	pstmt.executeUpdate();
	sql="SELECT * FROM BOOK";
	pstmt = conn.prepareStatement(sql);
	rs=pstmt.executeQuery();
	out.print("<table border='1'><tr><th>BOOKID</th><th>BOOK NAME</th><th>PUBLISHER</th><th>PRICE</th></tr>");
	while(rs.next()){
	out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
	}
	out.print("</table>");
}catch(ClassNotFoundException e){
	e.printStackTrace();
}catch(SQLException e){
	e.printStackTrace();
}
finally{
	conn.close();
}
%>

</body>
</html>