<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	백엔드
	<% request.setCharacterEncoding("UTF-8"); %>
	아이디 : <%=request.getParameter("userid")%>
	비밀번호 : <%=request.getParameter("userpw")%>
	<!-- 아이디와 비밀번호 확인 -->
	<%-- <%
		String userid= request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		if (userid.equals("admin")&& userpw.equals("admin")){
			response.sendRedirect("loginSuccess.jsp");
		}else{
			response.sendRedirect("loginFail.jsp");
		}
	%> --%>
	
	<% if(request.getMethod().equals("POST")){ %>
	<%
	String userid= request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	/* 유효성 처리 */
	if(userid.isEmpty() | userpw.isEmpty()){
	RequestDispatcher rd= request.getRequestDispatcher("loginForm.jsp");
	rd.forward(request, response);
	}
	// 로그인 처리
	if(session.isNew() || session.getAttribute("userid")==null){
		session.setAttribute("userid",userid); //"userid"란 이름으로 userid등록
		out.print("로긴 완료되었음");
		/* 새로운 아이디로 로그인 햇을 때 */
	}else{
		out.print("이미 로긴 상태임");
	}
	%>
	아이디 : <%=userid %> / 비밀번호 : <%=userpw %>
	<%
	response.sendRedirect("loginForm.jsp");
	}
	else if(request.getMethod().equals("GET")){
		if(session != null || session.getAttribute("userid")!= null){
			session.invalidate(); out.print("로그아웃 작업이 완료됨");
		} else{
			out.print("현재 로긴 상태가 아님");
		}
	}
	%>
	<%-- <% 
	String userid= request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	if(userid.isEmpty() | userpw.isEmpty()){
	RequestDispatcher rd= request.getRequestDispatcher("loginForm.jsp");
	rd.forward(request, response); /* 다른페이지에 정보를 다 주면서 권한 위임 */
	return;
	/* 블럭 탈출 */
	}
	%> --%>
</body>
</html>