<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form.jsp 의 p를 받아와서 .jsp를 붙여준다.
 form.jsp랑 굳이 연결안해도 자동으로 해주는듯.. 신기 -->
	<% String p=request.getParameter("p");
	p+=".jsp";%>
	<jsp:forward page="<%=p %>"/>
</body>
</html>