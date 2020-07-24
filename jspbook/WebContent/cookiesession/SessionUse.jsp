<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("UTF-8");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>세션 로그인</title>
</head>
<body>
	<%
		//request 내장객체를 사용했을때 : 로그인 해제됨
		/* String id=request.getParameter("id");
		String pass=request.getParameter("pass"); */
	%>
	<%
		String id=(String)session.getAttribute("id");//session은 Object여서 다운캐스팅
		String pass=(String)session.getAttribute("pass");
	%>
	<center>
		<h1>세션 로그인 처리2</h1>
		넘어온 페이지...<br>
		<hr>
		<h2><%=id %>님 반갑습니다.</h2>
	</center>
</body>
</html>