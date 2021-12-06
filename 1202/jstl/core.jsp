<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String str=
request.getParameter("msg"); %>
<c:catch var="e">
<%if(str.equals("add")){
	out.print(str);
	}%>
</c:catch>
<c:out value="${e }"/>
</body>
</html>