<!-- 로그인후 화면  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <!--   useBean 선언 -->
<!DOCTYPE html>
<!-- bean클래스 연결 -->
<jsp:useBean id="login" class="jspbook.ch07.LoginBean" scope="page"></jsp:useBean>
<!-- jspbook.ch07.login=new jspbook.ch07.LoginBean() -->

<!-- jsp:setProperty 객체 설정 -->
<jsp:setProperty name="login" property="*"/>


<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<div align="center">
		<h2>로그인 예제</h2>
		<hr>
		<%
			//spbook.ch07.LoginBean의 checkUser()를 통해 로그인 여부 판단
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