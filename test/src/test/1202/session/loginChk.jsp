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
/* 로그인 처리 */

	out.print("아이디 " +session.getAttribute("adminId")+"로 로그인 한 상태");


%>
<%-- 아이디 <%=application.getInitParameter("adminId") %>로 로그인 한 상태 --%>
<a href="logout.jsp">로그아웃</a>
</body>
</html>