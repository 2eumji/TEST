<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="join" class="jspbook.ch07.JoinBean" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="join"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>결과 페이지</title>
</head>
<body>
	<div align=center>
		<h2>회원 가입완료</h2>
		<% request.setCharacterEncoding("UTF-8"); %>
		<table border=1 cellpadding="10">
				<tr>
	                <td>아이디</td>
	                <td><jsp:getProperty property="id" name="join"/></td>
	            </tr>
	            <tr>
	                <td>패스워드</td>
	                <td><jsp:getProperty property="pw1" name="join"/></td>
	            </tr>
	            <tr>
	                <td>패스워드 확인</td>
	                <td><jsp:getProperty property="pw2" name="join"/></td>
	            </tr>
	            <tr>
	                <td>이메일</td>
	                <td><jsp:getProperty property="email" name="join"/></td>
	            </tr>
	       </table>
	</div>
</body>
</html>