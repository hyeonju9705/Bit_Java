<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
    <%@ page import="org.global.beans.Members" %>
<!DOCTYPE html>
    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%-- <jsp:useBean class="org.global.beans.Members" id="member"/>

<jsp:setProperty property="name" name="member" value="conan"/>
<jsp:setProperty property="number" name="member" value="010-2305-8913"/>
<jsp:getProperty property="name" name="member"/>
<jsp:getProperty property="number" name="member"/> --%>


<%
Members mem=new Members();
mem.setUserId("conan");
mem.setName("코난");
%>
이름 : <%=mem.getName() %>
,아이디 : <%=mem.getUserId() %>
</body>
</html>