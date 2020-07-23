<%@page import="java.net.URLEncoder"%>
<%@page import="model.MemberDBBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>회원정보 확인</title>
</head>
<body>
	<center>
		<h2>전체 회원 보기</h2>
		<%
			MemberDAO mdao=new MemberDAO();
			//모든 회원정보를 가져와야하니까 List(Vector)
			Vector<MemberDBBean> v=mdao.allSelectMember();
		%>
	
	<table width="600" border="1" cellpadding="5" cellspacing="0">
		<tr height="40">
			<th width="120" align="center">아이디</th>
			<th width="120" align="center">이메일</th>
			<th width="120" align="center">전화번호</th>
			<th width="120" align="center">취미</th>
			<th width="120" align="center">직업</th>
		</tr>
		<%
			for(int i=0;i<v.size();i++){
				MemberDBBean bean = v.get(i);//박스에서 데이터를 꺼내서 화면에 출력하기위해 저장
		%>
		<tr height="40">
			<!-- 상세페이지  -->
			<td width="120" align="left"><a href="MemberInfo.jsp?id=<%= URLEncoder.encode(bean.getId(),"UTF-8")%>"><%=bean.getId() %></a></td>
			<td width="120" align="left"><%=bean.getEmail() %></td>
			<td width="120" align="left"><%=bean.getPhone() %></td>
			<td width="120" align="left"><%=bean.getHobby() %></td>
			<td width="120" align="left"><%=bean.getJob() %></td>
		</tr>
		<%
			}
		%>
	</table>
	</center>
</body>
</html>