<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method="POST" action="joinProc.jsp">
		<table border="1">
			<tr>
				<th colspan="4">회원가입 정보</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>

			<tr>
				<td>이름</td>
				<td><input type="text" name="name"> </td>
				<td>이메일</td>
				<td><input type="text" name="e-mail"></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="가입하기"></td>
			</tr>
		</table>
	</form>
</body>
</html>