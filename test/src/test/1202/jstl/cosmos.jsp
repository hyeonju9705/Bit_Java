<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="org.global.beans.BookBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% BookBean book = new BookBean(); %>
<c:set target="<%=book %>" property="title" value="코스모스"/>
<%=book.getTitle() %><br/>
<c:set var="b" value="<%=book %>"/>
<c:set target="${b }" property="author" value="세이건"/>
${b.author }

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