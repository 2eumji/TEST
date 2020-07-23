<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id=request.getParameter("id");
%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>회원정보 삭제하기</title>
</head>
<body>
	<center>
		<h1>회원정보 삭제하기</h1>
		<form action="MemberDeleteProc.jsp" method="post">
			<table width="400" border="1">
				<tr>
					<td align="center" width="150">아이디</td>
					<td width="250"><%=id %></td>
				</tr>
				<tr>
					<td align="center" width="150">패스워드입력</td>
					<td width="250"><input type="password" name="pass1"></td>
				</tr>
				<tr>
					<td align="center" colspan="2">
					<input type="hidden" name="id" value="<%=id %>">
					<input type="submit" value="삭제하기">
					<input type="button" value="전체회원보기" onclick="location.href='MemberList.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>