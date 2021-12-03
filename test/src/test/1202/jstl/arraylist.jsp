<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*, java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="org.global.beans.BookBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
ArrayList<BookBean> bookList=new ArrayList<BookBean>();
bookList.add(new BookBean("명탐정 홈즈","코난 도일","모름"));
bookList.add(new BookBean("코스모스","칼 세이건","모름"));

String[] bookCode={ "소설","역사","인문","정치","미술","종교","여행","과학","만화"};%>
<c:set var="list" value="<%=bookList %>"/>
<!-- list라는 변수명으로 booklist값을 setting -->
<c:forEach var = "item" items="${list }">
<!-- items에다가 list변수를 담아서 item이라는 변수명에 저장하고 list없어질때까지 for문 돌아감 -->
${item.title }/${item.author }/${item.publisher }<br>
</c:forEach>
<hr>
<c:set var="code" value="<%=bookCode %>"/>
<c:forEach var = "item" items="${code }">
<c:out value="${item }"/>
</c:forEach>
</body>
</html>