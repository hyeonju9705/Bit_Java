<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="portal"> 
<!-- portal 이름을 갖고있는 portal servlet으로 보냄 -->
<input type="radio" name="site" value="naver">네이버 <br/>
<input type="radio" name="site" value="google">구글<br/>
<input type="submit" value="이동"/>
</form>
</body>
</html>