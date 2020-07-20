<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<meta charset="UTF-8">
<title>ch06 : request_result.jsp</title>
</head>
<body>
<div align="center">
	<h2> request 테스트 결과 1</h2>
	<hr>
	<table border=1 cellspacing="0" cellpadding="5">
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("username") %></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%=request.getParameter("job") %></td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
			<%
				/* 체크박스 값들을 배열 : 복수의 값일 수 있으니 getParameterValues메소드를 이용하여 
					favorite로 설정된 form의 로 가져옴  */
				String fav[]=request.getParameterValues("favorite");
				for(String favorite : fav){
					out.println(favorite+"<br>");
				}
			
			%></td>
		</tr>
	</table>
	<hr>
	<h2>request 테스트 결과 2</h2>
	<table border=0>
		<tr>
			<td>
			1. 클라이언트 IP 주소 : <%= request.getRemoteAddr() %><br>
			2. 요청 메소드 :<%= request.getMethod() %><br>
			<%
				Cookie cookie[]=request.getCookies();
			%>
			3. 쿠키 값 :<%= cookie[0].getName() %>에 설정된 쿠키값 : <%=cookie[0].getValue() %><br>
			4. 프로토콜 :<%= request.getProtocol()%>
			
			
			</td>
		</tr>
		
	
	</table>
</div>

</body>
</html>