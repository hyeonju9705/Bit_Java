<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- java beans field가 private 인데도 그냥 꺼내올 수 있는 이유는
book.bookid로 해주는 이유는 우리가 book이라는 거를 BookReg servlet 에다가 만들어서
java공유체로서 book이 쓰이기 땜에 book을 꺼내올 수 있다는 것..!!!!  -->
bookId : ${book.bookid }
<br>title : ${book.bookname }
<br>publisher: ${book.publisher }
<br>price : ${book.price }<br>
</body>
</html>