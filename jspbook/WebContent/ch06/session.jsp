<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ch05 : session.jsp</title>
</head>
<body>
	<div align="center">
	<h2>session 예제1</h2>
	<hr>
	<%
	 if(session.isNew()){
		 out.println("<script> alert('세션이 해제되어 다시 설정합니다')</script>");
		 session.setAttribute("login", "홍길동");
	 }
	%>
	# <%=session.getAttribute("login") %>님 환영합니다.<br>
	1. 세션 ID : <%= session.getId() %><br>
	<%session.setMaxInactiveInterval(5); %> <!--세션 유지시간 5초로 변경 (기본 6분)  -->
	2. 세션 유지시간: <%=session.getMaxInactiveInterval() %><br>
	
	</div>

</body>
</html>