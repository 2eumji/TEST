<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="ElLoginProc.jsp" method="post">
			<table width="300" border="1">
				<tr height="40">
					<td width="120">아이디</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr height="40">
					<td width="120">패스워드</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr height="40">
					<td align="center" colspan="2">
						<input type="submit" value="로그인">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>