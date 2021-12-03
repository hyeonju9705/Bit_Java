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
	String checkbox= request.getParameter("checkbox");
	
	/* 유효성 처리 */
	if (adminId.isEmpty() || adminPwd.isEmpty()) {
		RequestDispatcher rd = request.getRequestDispatcher("loginFrm2.jsp");
		rd.forward(request, response);
	}
	/* 쿠키 생성 */
	if(checkbox.equals("true")){
		Cookie cookie = new Cookie("adminId", adminId); // applecookie라는 이름으로 apple로 쌍을 지어서 보냄.
		cookie.setMaxAge(60*1); //1minute인데 시간이 지나면 저장해논 쿠키가 다 사라짐
		response.addCookie(cookie);
	}
	/* 로그인 처리 */
	if (adminId.equals(application.getInitParameter("adminId"))&& adminPwd.equals(application.getInitParameter("adminPwd"))) {
		session.setAttribute("adminId", adminId);
		out.print("로그인에 성공했음<br>");
		%>
		<a href="loginFrm.jsp">로그인 폼으로</a>
		<% 
	} else if(adminId.equals(application.getInitParameter("adminId"))){
		out.print("<script>alert('비밀번호 불일치');history.back();</script>");
	}else{
		out.print("<script>alert('아이디 불일치');history.back();</script>");
	}
	}%>
	
	
</body>
</html>