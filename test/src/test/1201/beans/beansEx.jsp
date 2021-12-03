<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%@ page import="org.global.beans.HelloBean" %>
<%
HelloBean hello = (HelloBean)request.getAttribute("hello");
if(hello==null){
	hello= new HelloBean();
	request.setAttrivute("hello",hello);
}
out.println(hello.getName());
hello.setName("conan");
out.println(hello.getName());
%> --%>
<jsp:useBean class="org.global.beans.HelloBean" id="hello"/>

<jsp:setProperty property="name" name="hello" value="conan"/>
<jsp:setProperty property="number" name="hello" value="010-2305-8913"/>
<jsp:getProperty property="name" name="hello"/>
<jsp:getProperty property="number" name="hello"/>
<hr>
<jsp:setProperty property="name" name="hello" param="name"/>
<jsp:setProperty property="number" name="hello" param="number"/>
<jsp:getProperty property="name" name="hello"/>
<jsp:getProperty property="number" name="hello"/>

</body>
</html>