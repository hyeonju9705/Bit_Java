<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 내장객체 : param -->
<h3>el 표기법</h3>
${param.id }/${param.pwd }<br>
${param["id"] }/${param["pwd"] }<br>
<hr/>

<h3>jsp</h3>
<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
%>
<%=id %>/<%=pwd %>
</body>
</html>