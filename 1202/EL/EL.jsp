<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*, java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("cnt", 3); %>
<%= request.getAttribute("cnt") %>

${cnt}

<%String[] strArray = {"1","2","3"};
List<String> list = Arrays.asList(strArray);
request.setAttribute("list",list);
%>
<%=((List)request.getAttribute("list")).get(0) %>
${list[0] }

<% Map<String, String> map
= new HashMap<String,String>();
map.put("name","코난");
request.setAttribute("map",map);%>
<%=
((Map)request.getAttribute("map")).get("name")%>
${map.name }
</body>
</html>