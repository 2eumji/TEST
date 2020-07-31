<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>회원정보 확인</title>
</head>
<body>
	<center>
		<h2>전체 회원 보기</h2>
	
	<table width="600" border="1" cellpadding="5" cellspacing="0">
		<tr height="40">
			<th width="120" align="center">아이디</th>
			<th width="120" align="center">이메일</th>
			<th width="120" align="center">전화번호</th>
			<th width="120" align="center">취미</th>
			<th width="120" align="center">직업</th>
		</tr>
	<!-- model2 -->
		<c:forEach var="bean" items="${vec}">
		<tr>
			<td width="120" align="left">${bean.id}</td>
			<td width="120" align="left"><a href="MemberInfo.jsp?email="${bean.email}">${bean.email}</a></td>
			<td width="120" align="left">${bean.tel}</td>
			<td width="120" align="left">${bean.hobby}</td>
			<td width="120" align="left">${bean.job}</td>
		</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>