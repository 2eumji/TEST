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

	<div align="center">
		<h2>세션 로그인</h2>
		<form action="SessionLoginProc.jsp" method="post">
			<table border=1 width="400">
				<tr height="40">
					<td align="center">아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr height="40">
					<td align="center">패스워드</td>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr height="40">
					<td colspan="2" align="center">
						<input type="submit" value="세션로그인">
					</td>
				</tr>		
			</table>
		</form>
	</div>

</body>
</html>