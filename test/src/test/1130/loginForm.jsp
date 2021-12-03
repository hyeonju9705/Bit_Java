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
	if (session.isNew() || session.getAttribute("userid")==null){
	String msg = (String)request.getAttribute("error");
	%>

	<form action="loginProject.jsp" method="post">
	ID : <input type="text" name="userid"><br/>
	비밀번호 : <input type="password" name="userpw"><br/>
	<input type="submit" value="로그인"/>
	
	</form>
	<% } else { %>
	<a href="loginProject.jsp">로그아웃</a>
	<% } %>
</body>
</html>