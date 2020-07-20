<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<% request.setCharacterEncoding("UTF-8"); %> <!-- 한글꺠짐방지 -->
<title>ResPonse 로그인</title>
</head>
<body>
<center>
	<h2>ResPonse 로그인</h2>
	<form action="ResponseProc.jsp" method="post">
		<table align="center" width="300" border="1">
			<tr height="40">
				<td width="120" align="center">아이디</td>
				<td width="180" align="center"><input type="text" name="id"></td>
			</tr>
			<tr height="40">
				<td width="120" align="center">패스워드</td>
				<td width="180" align="center"><input type="password" name="pass"></td>
			</tr>
			<tr height="40">
				<td colspan="2" align="center"><input type="submit" value="로그인"></td>
			</tr>
		</table>
	
	</form>

</center>
</body>
</html>