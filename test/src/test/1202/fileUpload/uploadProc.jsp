<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.oreilly.servlet.*, com.oreilly.servlet.multipart.*,java.util.*,
    java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String path= application.getRealPath("/upload"); //파일이 저장될 위치
//실제로 저장되는 공간과 다름
//C:\test\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\bitJSP의
//upload 폴더에 저장되었음 대박,,
int size = 1024* 1024*10; //10m
try{
	MultipartRequest multi = new MultipartRequest(
	request,path,size,"UTF-8", new DefaultFileRenamePolicy());
	Enumeration files = multi.getFileNames();
	String name=(String)files.nextElement();
	String file = multi.getFilesystemName(name);
	long fileSize= multi.getFile("file").length();
	String orgFile = multi.getOriginalFileName(name);
	String type = multi.getContentType(name);
	out.println("파일명 : "+file+"<br/>");
	out.println("파일크기: "+fileSize+"<br/>");
	out.println("원본파일명 : "+orgFile+"<br/>");
	out.println("컨텐츠 유형: "+type+"<br/>");
	out.println("사용자가 입력한 설명 " +multi.getParameter("desc"));
	//request.getParameter()로 받는게아니라 multi.getParameter로 받는 이유
	// MultipartRequest multi= ~~에서 모든 요청을 다 multi에 넣어버리기땜에
	//request.getParameter가 아닌 multi.getParameter로 받아야함
	//중요!!!!!!!!!
}catch(Exception e){
	out.print("업로드 오류 발생");
			
}

%>
</body>
</html>