<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>   
<!DOCTYPE html>
<html>
<head>
<!-- 1203 -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean class="org.global.beans.Members2" id="member" />
<!-- param 은 joinFrm.jsp에서 input의 name -->
<!-- 그다음 그걸 property=""로 저장하는거임 -->
<jsp:setProperty property="userId" name="member" param="userId"/>
<jsp:setProperty property="userPwd" name="member" param="userPwd"/>
<jsp:setProperty property="userName" name="member" param="userName"/>
<jsp:setProperty property="phoneNo" name="member" param="phoneNo"/>
<jsp:setProperty property="address" name="member" param="address"/>
<jsp:setProperty property="email" name="member" param="email"/>


<body>
사용자가 입력한 데이터
<%-- <table border="1"> 여기아님***************!!!!!!!!!!!!!!!!!!!!!!!! 여기 아니고 sql try 문 안에서 해야함
<tr>
<td>아이디</td>
<!-- property로 불러오는거임 -->
<td>
<jsp:getProperty property="userId" name="member"/>
</td>
<td>비밀번호</td>
<td><jsp:getProperty property="userPwd" name="member"/></td>
</tr>
<tr>
<td>이름</td>
<td><jsp:getProperty property="userName" name="member"/></td>
<td>전화번호</td>
<td><jsp:getProperty property="phoneNo" name="member"/></td>
</tr>
<tr>
<td>주소</td>
<td><jsp:getProperty property="address" name="member"/></td>
<td>이메일</td>
<td><jsp:getProperty property="email" name="member"/></td>
</tr>
<tr><td colspan="4">
시간 불러오는곳
</td>
</table> --%>



<%
String userId=request.getParameter("userId"); //joinForm에서 받은 name의 정보를 getParameter로 String userId에저장
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
	
sql= "insert into Members2 (userId,userPwd,userName,phoneNo,address,email) values(?,?,?,?,?,?);";
pstmt = conn.prepareStatement(sql); //db에 insert
pstmt.setString(1,userId);
pstmt.setString(2,userPwd);
pstmt.setString(3,userName);
pstmt.setString(4,phoneNo);
pstmt.setString(5,address);
pstmt.setString(6,email); 
pstmt.executeUpdate(); 

sql="select * from Members2 where userId=?"; //사용자가 입력한 userId랑 같은 것의 테이블 정보를 다 가져옴
pstmt = conn.prepareStatement(sql);
pstmt.setString(1,userId);
rs = pstmt.executeQuery();
rs.next();
%>
<table border="1">
<tr>
<td>아이디</td>
<!-- property로 불러오는거임 -->
<td>
<%=rs.getString(1) %>
</td>
<td>비밀번호</td>
<td><%=rs.getString(2) %></td>
</tr>
<tr>
<td>이름</td>
<td><%=rs.getString(3) %></td>
<td>전화번호</td>
<td><%=rs.getString(4) %></td>
</tr>
<tr>
<td>주소</td>
<td><%=rs.getString(5) %></td>
<td>이메일</td>
<td><%=rs.getString(6) %></td>
</tr>
<tr>
<td colspan="4"><%=rs.getString(7)%></td>
</table>
<%}catch(ClassNotFoundException e){
	e.printStackTrace();
}catch(SQLException e){
	e.printStackTrace();
}
finally{
	conn.close();
}
%>
<jsp:forward page="joinResult.jsp"/> 
</body>
</html>