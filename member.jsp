<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="org.global.dao.MemberDAO, org.global.beans.MemberDTO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- dao를 만들었으니까 dao를 import해줘야함. dao가 들어있는 package이름으로 불러오기 
	dto도 필요함(arrayList를 가져오기위해서) -->

<%
MemberDAO dao = MemberDAO.getInstance();
/* 보통 dao로 설정해준다. getInstance()를 해서 MemberDAO의 static 메소드인
	getInstance()를 불러와서 자기 자신인 dao를 불러와주는것....
	근데 이게 singleton으로 정의되어있는데 singleton이 뭐냐면 new 없이 객체생성이 가능한것
	객체 생성을 여러개 하지말구 정해놓은 dao 딱 하나로만 하라는 뜻이여~~~~
	그래서 객체생성이 복잡하지 않게 딱 한개만 가능해서 좋음....*/
ArrayList<MemberDTO> memList = dao.selectMemberAll();
/* dao.selectMemberAll() 을 memList에다가 넣어줌
근데 왜 ArrayList<MemberDTO> memList냐?? 
		그 이유는 selectMemberAll()이 ArrayList<MemberDTO> 형식으로
		memberDAO.java에서 정의해놨기 때문이야!!! */
/* out.print(memList.size()); */
request.setAttribute("memList", memList);
/* 그리고 request.setAttribute는 머냐면 memList라는 값을 "memList"로
사용하기 위해서 setting 해주는것 
이렇게 세팅 해주면 ${memList}로도 사용가능해 
참고로 $는 memList의 값을 가져오겠다는 뜻인듯 함 */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>이메일</th>
			<th>등록일</th>
		</tr>
		<c:forEach var="mem" items="${memList }">
		<!-- memList의 값을 mem이라는 변수명으로 사용하겠다 -->
			<tr>
				<td>${mem.userId }</td>
				<td>${mem.userPwd }</td>
				<td>${mem.userName }</td>
				<td>${mem.phoneNo }</td>
				<td>${mem.address }</td>
				<td>${mem.email }</td>
				<td>${mem.regDate }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>