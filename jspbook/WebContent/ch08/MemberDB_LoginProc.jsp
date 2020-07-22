<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="login" class="model.MemberDBBean" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>로그인 예제</h2>
		<hr>
		<%
			request.setCharacterEncoding("UTF-8");
			if(!login.checkUser()){
				out.println("로그인 실패");
			}else{
				out.println("로그인 성공");
			}
		%>
		<hr>
		<!-- jsp: getProperty 화면에 데이터 출력하는 용도 -->
		사용자 아이디: <jsp:getProperty property="userid" name="login"/>
		사용자 패스워드: <jsp:getProperty property="password" name="login"/>
		
	</div>
</body>
</html>