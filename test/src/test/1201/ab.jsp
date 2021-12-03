<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>Forward Tag Example</b>
<br><br>
	<% String name= request.getParameter("name"); %>
	<%=java.net.URLDecoder.decode(name) %>님의 혈액형은 
	AB형이고 이상한사람이다.
</body>
</html>