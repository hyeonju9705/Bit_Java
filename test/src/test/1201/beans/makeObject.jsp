<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 한번에 속성 주는ㄱㅓ -->
<jsp:useBean id="member" scope="request" class="org.global.beans.Members"/>
<jsp:setProperty property="*" name="member"/>
<jsp:forward page="useObject.jsp"/>
</body>
</html>