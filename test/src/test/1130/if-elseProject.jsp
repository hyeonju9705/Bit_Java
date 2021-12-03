<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% request.setCharacterEncoding("UTF-8"); %>
	 <%=request.getParameter("namae")%>
	님이 좋아하는 색깔은 <b><%=request.getParameter("color")%></b>입니다.
	<% 
	String color= request.getParameter("color");
	String no="";
	if(color.equals("붉은색")){
	no="red";
	
	}else if(color.equals("파란색")){
		no="blue";
	}else if(color.equals("흰색")){
	no="white";
	} %>
<body bgcolor=<%=no %>>

</body>
</html>