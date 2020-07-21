<%@page import="jspbook.ch07.AddrBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="am" class="jspbook.ch07.AddrManager" scope="application"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch07 : 주소록 목록</title>
</head>
<body>
	<div align="center">
		<h2>주소록</h2>
		<hr>
		<p><a href="addr_form.html">주소추가</a></p>
		<table border="1" cellpadding=5>
			<tr>
				<td>이름</td>
				<td>전화번호</td>
				<td>이메일</td>
				<td>성별</td>
			</tr>
			<%
				for ( AddrBean ab: am.getAddrList()){
			%>
			<tr>
				<td><%=ab.getUsername() %></td>
				<td><%=ab.getPhone() %></td>
				<td><%=ab.getEmail() %></td>
				<td><%=ab.getGender() %></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>