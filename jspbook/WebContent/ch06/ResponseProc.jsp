<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Response 로그인</title>
</head>
<body>
<%
	//고정 id/password값 부여
	String dbid="system";
	String dbpass="system";
	//reaquest객체에 저장되어 있는 id/password값 읽어오기
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	//두개의 아이디를 비교하는 소스를 작성
	if(dbid.equals(id)&& dbpass.equals(pass)){
		session.setAttribute("id", id);
		response.sendRedirect("ResponseLogin.jsp"); //맞으면 이쪽으로 보내기	
		//get방식
		//response.sendRedirect("ResponseLogin.jsp?id="+id);
	}else{
%>
	<script type="text/javascript">
		alert("등록되지 않은 아이디입니다.");
		//전단계로 이동
		history.go(-1);
	</script>
	<%
	} %>
	되돌아 오기!!!
</body>
</html>