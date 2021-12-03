<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	%>
	<!-- 한글 깨짐 처리 -->
	<jsp:useBean id="book" class="org.global.beans.BookBean" /> 
	<!-- 여기서 id=book은 Person p = new Person() 의 p 같은 느낌 생성자이름(?) -->
	<jsp:setProperty property="*" name="book" />
	<!-- name book이 밑줄의 "book"이 아닌 book이다. "book"은 내가 부를 이름 -->
	<%
	request.setAttribute("book", book);
	%>
	<jsp:forward page="bookOutput.jsp" />
</body>
</html>