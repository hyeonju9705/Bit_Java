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
	if (request.getMethod().equals("POST")) { // 대문자 주의!! 무조건 대문자로 안하면 못읽어옴
	%>
	<%
	String adminId = request.getParameter("adminId");
	String adminPwd = request.getParameter("adminPwd");
	/* 유효성 처리 */
	if (adminId.isEmpty() || adminPwd.isEmpty()) {
		RequestDispatcher rd = request.getRequestDispatcher("loginFrm2.jsp");
		rd.forward(request, response);
	}
	/* 로그인 처리 */
	if (adminId.equals(application.getInitParameter("adminId"))&& adminPwd.equals(application.getInitParameter("adminPwd"))) {
		session.setAttribute("adminId", adminId);
		out.print("로그인에 성공했음<br>");
	} else {
		out.print("로그인실패");
	}
	}
	%>

	<!-- 로그인에 성공했음<br> -->
	<a href="loginChk.jsp">로그인 정보 확인</a>
</body>
</html>