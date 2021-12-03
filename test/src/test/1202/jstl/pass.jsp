<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="num" value="${55 }"/>
점수: <c:out value="${num}"/>은
<c:if test="${num>60 }">합격입니다</c:if>
<c:choose>
<!-- case문이랑 비슷하다고 보면됨 -->
<c:when test="${ num>=90 }">A학점입니다.</c:when>
<c:when test="${ num>=80 }">A학점입니다.</c:when>
<c:when test="${ num>=70 }">A학점입니다.</c:when>
<c:when test="${ num>=60 }">A학점입니다.</c:when>
<c:otherwise>F학점입니다.</c:otherwise>
</c:choose>
</body>
</html>