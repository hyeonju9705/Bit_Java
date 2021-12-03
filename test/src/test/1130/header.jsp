<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p{
	background-color: yellow;
}
</style>
</head>
<body >
<p>Header임!!</p>
<%!
		int count = 0;
	%>
	<%
	out.println(++count);
	%>
번째 방문입니다
</body>
</html>