<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userId=request.getParameter("userId");
String userPwd=request.getParameter("userPwd");
String userName=request.getParameter("userName");
String phoneNo=request.getParameter("phoneNo");
String address=request.getParameter("address");
String email=request.getParameter("email");
String url="jdbc:mysql://localhost:3306/scottDB?useSSL=false";
String dbId="scott",dbPwd="tiger";
Connection conn=null;
String sql=null;
PreparedStatement pstmt = null;
ResultSet rs= null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=DriverManager.getConnection(url,dbId,dbPwd);
	/* out.println("데이터베이스 연결 성공"); */
sql= "update Members2 set userPwd=? ,userName=?,phoneNo=?,address=?,email=? where userId=?";
pstmt= conn.prepareStatement(sql);
pstmt.setString(1,userPwd);
pstmt.setString(2,userName);
pstmt.setString(3,phoneNo);
pstmt.setString(4,address);
pstmt.setString(5,email);
pstmt.setString(6,userId);
pstmt.executeUpdate();
sql="select * from Members2 where userId=?"; //이렇게 하면 콜럼 1번부터 쫘라락 나오는데 이거를 getString(n)으로 사용가능
pstmt= conn.prepareStatement(sql);
pstmt.setString(1,userId);
rs=pstmt.executeQuery();
rs.next();

session.setAttribute("userId",rs.getString(1)); //세션 생성
%>
<table border="1">
<tr>
<td>아이디</td>
<td><%=rs.getString(1) %></td>
</tr>
<tr>
<td>비밀번호</td>
<td><%=rs.getString(2) %></td>
</tr>
<tr>
<td>이름</td>
<td><%=rs.getString(3) %></td>
</tr>
<tr>
<td>전화번호</td>
<td><%=rs.getString(4) %></td>
</tr>
<tr>
<td>주소</td>
<td><%=rs.getString(5) %></td>
</tr>
<tr>
<td>이메일</td>
<td><%=rs.getString(6) %></td>
</tr>
<tr>
<td colspan="2"><%=rs.getString(7) %>
</td></tr>

</table>

<%
}catch(ClassNotFoundException e){
	e.printStackTrace();
}catch(SQLException e){
	e.printStackTrace();
}
finally{
	
}
%>
<jsp:forward page="updateResult.jsp"/>

</body>
</html>