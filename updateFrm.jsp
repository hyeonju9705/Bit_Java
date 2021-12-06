<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>

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
sql= "select * from Members2 where userId="+(String)session.getAttribute("userId");
pstmt= conn.prepareStatement(sql);

rs=pstmt.executeQuery();

rs.next();

}catch(ClassNotFoundException e){
	e.printStackTrace();
}catch(SQLException e){
	e.printStackTrace();
}
finally{
	
}
%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateProc.do" method="POST">
<table border="1">
<tr>
<td>아이디</td>
<td><input type="text" value='<%=rs.getString(1) %>' name="userId" readonly></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" value='<%=rs.getString(2) %>' name="userPwd"></td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" value='<%=rs.getString(3) %>' name="userName"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" value='<%=rs.getString(4) %>' name="phoneNo"></td>
</tr>
<tr>
<td>주소</td>
<td><input type="text" value='<%=rs.getString(5) %>' name="address" ></td>
</tr>
<tr>
<td>이메일</td>
<td><input type="text" value='<%=rs.getString(6) %>' name="email"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="수정하기">
</td></tr>

</table>
<%conn.close();%>
</form>

</body>
</html>