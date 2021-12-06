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
Cookie[] cookies = request.getCookies();
for( int i=0; i<cookies.length; i++){
	cookies[i].setMaxAge(0); // 쿠키의 유효시간을 결정하는 setMaxAge()메소드에 유효기간을 0으로 설정하여 쿠키삭제
	response.addCookie(cookies[i]);
}
response.sendRedirect("tasteCookie.jsp");
%>
</body>
</html>