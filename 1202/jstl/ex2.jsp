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
<c:set var="name" value="amy"/><c:out value="${name }"/><br/> 
<!-- 여기선 amy로 밸류를 줬으니 amy가 출력되지만 밑에서 지우므로 아무것도 출력되지 않을것임-->
<c:remove var="name"/>
<c:out value="${name }"/><br/>
<%
BookBean book1=new BookBean("명탐정 홈즈","코난 도일","모름");
request.setAttribute("bookOne",book1);
%>
<c:set var="title" value="${bookOne.title }"/><c:out value="${title }"/>
<c:set var = "author" value="<%=book1.getAuthor() %>"/>
<c:out value="${author }"/><hr>
<c:set var="name">Wilde</c:set>
<c:out value="${name }"/><br>
<%
BookBean book2=new BookBean("도리안 그레이의 초상", "오스카 와일드", "모름");
request.setAttribute("bookTwo",book2);
%>
<c:set var="title" value="${bookTwo.title }"/><c:out value="${title }"/>
<c:set var="author" value="<%=book2.getAuthor() %>"/>
<c:out value="${author }"/>
</body>
</html>