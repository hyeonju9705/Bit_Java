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
<%
ArrayList<BookBean2> bookList = new ArrayList<BookBean2>(); //arraylist를 만드는 이유는
//배열은 크기도 선정해줘야하고, 계속 배열의 몇번째인지 확인해야하지만, arrayList는 그럴필요가 없어서 편함
//그리고 bookbean을 임포트 해와서 arrayList로 만드는것.

//1. JNDI 서버 객체 생성
InitialContext ic = new InitialContext();
//2. lookup()
DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
//3. getConnection()
Connection conn = ds.getConnection();
PreparedStatement pstmt = conn.prepareStatement("select * from book"); //여기서 book테이블에 있는 거를
//다 들고와줌
ResultSet rs = pstmt.executeQuery(); //쿼리문 돌려주고
while (rs.next()) { //while문으로 들어오면 rs.next()할 수 있을때까지 해주는거..
	bookList.add(new BookBean2(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
//array리스트인 bookList에 add를 해줄껀데 뭘 add를 해줄꺼냐면
//bookbean2에 field형식에 맞게 저장할껀데 select해서 가져온 거의 1,2,3,4번째 컬럼 을 bookbean2 자바빈에서 
//한번 더 가공한다고 생각..
}
//반납(안할 시 문제생김)
rs.close();
pstmt.close();
conn.close();
%>
<c:set var="list" value="<%=bookList%>" />
<!-- booklist는 위에서 보면 bookbean2를 array리스트로 만든것 인데 이거를 list라는 변수명으로 setting하겟다 -->
<body>
	<table border="1">
		<tr>
			<th style="background-color: blue;">BOOKNAME</th>
			<th style="background-color: blue;">PUBLISHER</th>
			<th style="background-color: blue;">PRICE</th>
		</tr>
		<c:forEach var="item" items="${list }">
		<!-- item에다가 list변수를 담아서 item이라는 변수명에 저장하고 list없어질때까지 for문 돌아감 -->
			<tr>
				<td><a href="bookview.jsp?bookid=${item.bookid }">${item.bookname }</a></td>
				<!-- bookid를 get 방식으로 url로 전송할것임 -->
				<td>${item.publisher }</td>
				<td>${item.price }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>