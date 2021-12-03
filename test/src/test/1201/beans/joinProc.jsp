<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="org.global.beans.Members" id="member" />
<!-- param 은 joinFrm.jsp에서 input의 name -->
<jsp:setProperty property="userId" name="member" param="id"/>
<jsp:setProperty property="userPwd" name="member" param="pw"/>
<jsp:setProperty property="name" name="member" param="name"/>
<jsp:setProperty property="email" name="member" param="e-mail"/>
	<table border="1">
		<tr>
			<th colspan="4">회원가입 정보</th>
		</tr>
		<tr>
			<td>아이디</td>
			<td><jsp:getProperty property="userId" name="member"/></td>
			<td>비밀번호</td>
			<td><jsp:getProperty property="userPwd" name="member"/></td>
		</tr>

		<tr>
			<td>이름</td>
			<td><jsp:getProperty property="name" name="member"/></td>
			<td>이메일</td>
			<td><jsp:getProperty property="email" name="member"/></td>
		</tr>
	</table>
</body>
</html>