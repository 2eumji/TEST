<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>ch06 : page_cotrol.jsp</title>
</head>
<body>
<h2>forward, sendRedirect 테스트</h2>
<hr>
<form action="forward_action2.jsp" method=post>
	forward action : <input type=text name=username>
	<input type=submit value="Request">
</form>

<form action="response_sendRedirect.jsp" method=post>
	response.sendRedirect : <input type=text name=username>
	<input type=submit value="Response">
</form>

</body>
</html>