<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align=center>
		<h2>회원가입</h2>
		<form name="joinform" action="MProc2" method="post">
		<table border=1 cellpadding="10">
			<tr>
                <td>아이디</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>패스워드</td>
                <td><input type="password" name="pass"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>전화</td>
                <td><input type="tel" name="phone"></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type="email" name="email"></td>
            </tr>
             <tr align="center">
                <td colspan="2"><input type="submit" value="회원가입"></td>
            </tr>
		</table>
		</form>
		
	</div>
</body>
</html>