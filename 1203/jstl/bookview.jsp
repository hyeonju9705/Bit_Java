<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="org.global.beans.BookBean2, java.util.*,java.io.*,java.sql.*,javax.sql.*,javax.naming.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
BookBean2 bookbean2=new BookBean2();

String bookid=request.getParameter("bookid"); // get방식이고 get방식은 url에서 가져올 수 있음

ArrayList<BookBean2> bookList = new ArrayList<BookBean2>();
//1. JNDI 서버 객체 생성
InitialContext ic = new InitialContext();
//2. lookup()
DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
//3. getConnection()
Connection conn = ds.getConnection();
PreparedStatement pstmt = conn.prepareStatement("select * from book where bookid=?");
pstmt.setString(1,bookid);
ResultSet rs = pstmt.executeQuery();

while (rs.next()) {
	bookbean2 =new BookBean2(rs.getString(1),rs.getString(2), rs.getString(3), rs.getInt(4));
}
%>
	<c:set var="list" value="<%=bookbean2%>" />
	<table border="1">
		<tr>
			<td>책제목</td>
			<td>${list.bookname}</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>${list.publisher}</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>${list.price}</td>
		</tr>
		<tr>
			<td colspan="2"><a href="booklist.jsp">목록</a></td>
		</tr>
	</table>

</body>
</html>