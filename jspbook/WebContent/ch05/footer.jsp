<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch05: footer.jsp</title>
</head>
<body>
<!-- 표현식 출력 -->
<%= request.getParameter("email") %>,
<%= request.getParameter("tel") %>

<!-- 내장 객체 출력 -->
<%
	out.println(request.getParameter("tel"));
%>
</body>
</html>