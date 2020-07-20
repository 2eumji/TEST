<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Session Shopping</title>
</head>
<body>
	<%
		//세션에 저장되어있는 아이디를 읽어옴
		String id=(String)session.getAttribute("id"); //object클래스라서 다운캐스팅 필수~!!
	%>
	<h2><%=id %>님 환영합니다~~~~</h2>
	<!-- 5초되에 세션종료 -->
	세션 유지시간 : <%=session.getMaxInactiveInterval() %>
</body>
</html>