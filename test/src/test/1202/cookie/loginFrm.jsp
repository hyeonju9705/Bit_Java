<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	
		Cookie[] cookies = request.getCookies();
		String ck=""; // 초기화 ㄹㅇ 중요
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("adminId")) {
					 ck=cookie.getValue();
				} 
			}
		} 
	
	%>
<body>
	<form method="post" action="LoginProc.jsp">
		관리자 로그인<br> 아뒤 : <input type="text" name="adminId"
			value="<%=ck%>"> <label for="checkbox_id">
			<input type="checkbox" name="checkbox" id="checkbox_id" value="true">아이디
			기억
		</label><br> 비번 : <input type="password" name="adminPwd"> <input
			type="submit" value="전송">
	</form>
</body>
</html>