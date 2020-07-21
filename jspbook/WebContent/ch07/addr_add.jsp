<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 자바빈 선언 : 객체이름 addr -->
<jsp:useBean id="addr" class="jspbook.ch07.AddrBean" scope="page"></jsp:useBean>
<!-- 데이터 설정 가져오기 -->
<jsp:setProperty property="*" name="addr"/>
<!-- ArrayList클래스 만들어서 설정 -->
<!-- application은 통켓이 종료되면 소멸되므로 사용 -->
<jsp:useBean id="am" class="jspbook.ch07.AddrManager" scope="application"></jsp:useBean>
<%
	am.add(addr); //AddrBean의 객체추가
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch07 : addr_add.jsp</title>
</head>
<body>
	<div align="center">
		<h2>등록 내용</h2>
		이름 : <jsp:getProperty property="username" name="addr"/><br>
		전화번호: <%=addr.getPhone() %><br>
		이메일: <%=addr.getPhone() %><br>
		성별: <%=addr.getGender() %><br>
	<hr>
	<a href="addr_list.jsp">목록보기</a>
	</div>
	
</body>
</html>