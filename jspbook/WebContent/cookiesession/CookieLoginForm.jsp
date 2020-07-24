<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
  	request.setCharacterEncoding("UTF-8");
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String cookieid="";
	//쿠키의 갯수를 특정할수 없으므로 배열로 쿠키값을 받아옴
	Cookie [] cookie=request.getCookies();
	//배열이므로 반복문으로 읽어들임
	for(int i=0;i<cookie.length;i++){
		if(cookie[i].getName().equals("id")){//"id"는 아까 proc페이지에서 cookie객체생성했을떄 key이름
			//해당 값(id)을 읽어옴
			cookieid=cookie[i].getValue(); //이름이 id인 쿠키의 값을 cookieid에 저장
		}
		
	}

%>

	<div align="center">
		<h2>쿠키 로그인</h2>
		<form action="CookieLoginProc.jsp" method="post">
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
						<input type="checkbox" name="save" id="idsave" value="ok">
						<label for="idsave">아이디 저장</label>
					</td>
				</tr>
				<tr height="40">
					<td colspan="2" align="center">
						<input type="submit" value="쿠키로그인">
					</td>
				</tr>		
			</table>
		</form>
	</div>

</body>
</html>