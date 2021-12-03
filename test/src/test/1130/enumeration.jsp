<%@ page import="java.util.Enumeration"%>
<%
Enumeration<?> en = request.getHeaderNames();
while(en.hasMoreElements()){
String headerName=(String)en.nextElement();
String headerValue= request.getHeader(headerName);
%>
<%=headerName%> : <%=headerValue%><br>
<%
}
%>