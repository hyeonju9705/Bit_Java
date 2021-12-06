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
out.print((String)session.getAttribute("userId"));
%>
님 안녕하세요<br>
<a href="updateFrm.jsp">회원정보 수정</a>
</body>
</html>