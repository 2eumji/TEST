<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력받는페이지</title>
</head>
<body>
	<div align=center>
	<h2>회원 가입</h2>
	<form action="MemberBeanProc.jsp" method="post" name="join">
		<table border=1 cellpadding="10">
				<tr>
	                <td>아이디</td>
	                <td><input type="text" name="id"></td>
	            </tr>
	            <tr>
	                <td>패스워드</td>
	                <td><input type="password" name="pw1"></td>
	            </tr>
	            <tr>
	                <td>패스워드 확인</td>
	                <td><input type="password" name="pw2"></td>
	            </tr>
	            <tr>
	                <td>이메일</td>
	                <td><input type="email" name="email"></td>
	            </tr>
	             <tr align=center>
	                <td colspan="2">
	                	<input type="submit" value="회원가입">
	       				<input type="reset" value="취소">
	                </td>
	            </tr>
	       </table>
       </form>
       </div>
</body>
</html>