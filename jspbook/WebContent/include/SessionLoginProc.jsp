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
	<center>
		<h1>세션 로그인 1</h1>
		<%
			//request 내장 객체를 사용할 경우
			String id=request.getParameter("id");
			String pass=request.getParameter("pass");
			
			//request 내장객체를 사용해서 받아온 데이터를 session 으로 구현
			//form에서 바로 session으로 받을수 없으므로 request로 받은뒤에 변환해줘야 함
			session.setAttribute("id", id);
			session.setAttribute("pass", pass);
			
			session.setMaxInactiveInterval(180);//3분 (초단위)
			
			response.sendRedirect("SessionMain.jsp");
			
		%>
		
	</center>
</body>
</html>