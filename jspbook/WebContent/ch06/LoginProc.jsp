<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//w3c//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	
	//post 방식에서 한글꺠짐 방지
	request.setCharacterEncoding("UTF-8");
	//정보 받기
	String id=request.getParameter("id");
	
	String pass=request.getParameter("pass");
%>
	당신의 id=<%=id %>이고 패스워드는 <%=pass %>입니다.
</body>
</html>