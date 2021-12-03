<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int sum(int a, int b){
		return a+b; 
		/* 전역변수 선언부분, 함수 만들어서 선언 가능 */
	}
	%>
	<%
		out.println("2+3="+sum(2,3));
	%>
</body>
</html>