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
Cookie cookie = new Cookie("appleCookie", "apple"); // applecookie라는 이름으로 apple로 쌍을 지어서 보냄.
cookie.setMaxAge(60*1); //1minute인데 시간이 지나면 저장해논 쿠키가 다 사라짐
cookie.setValue("tea");
response.addCookie(cookie);
%>
<h3>---쿠키 생성---</h3>
<p>쿠키 내용 확인은 <a href="tasteCookie.jsp">여기로 </a>!!!</p>
</body>
</html>