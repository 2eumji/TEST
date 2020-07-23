<%@page import="model.MemberDBBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%
	String id=request.getParameter("id");
	MemberDAO mdao=new MemberDAO();
	MemberDBBean mbean=mdao.oneSelectMember(id);
%>

<center>
	<h1>회원 정보 수정</h1>
	<form action="MemberUpdateProc.jsp" method="post">
		<table width=400" border="1">
			<tr height="40">
				<td align="center" width="150">아이디</td>
				<td width="250"><%=mbean.getId() %></td>
			</tr>
			<tr height="40">
				<td align="center" width="150">전화번호</td>
				<td width="250"><input type="text" name="phone" value="<%=mbean.getPhone() %>"></td>
			</tr>
			<tr height="40">
				<td align="center" width="150">이메일</td>
				<td width="250"><input type="email" name="email" value="<%=mbean.getEmail() %>"></td>
			</tr>
			<tr height="40">
				<td align="center" width="150">패스워드 확인</td>
				<td width="250"><input type="password" name="pass1"></td>
			</tr>
			<tr height="40">
				<td align="center" colspan="2">
					<input type="hidden" name="id" value="<%=id%>">
					<input type="submit" value="수정완료">
					<input type="button" value="전체회원보기" onclick="location.href='MemberList.jsp'">
				</td>
			</tr>
		</table>
	</form>
</center>

</body>
</html>