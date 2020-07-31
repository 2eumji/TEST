<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : forEach</title>
</head>
<body bgcolor="#ffffff">
	<h3>&lt;c:forEach&gt;</h3>
	<c:forEach var="i" items="${members}" begin="0" varStatus="status" end="5">
		index : ${status.index}<br>
		count : ${status.count}<br>
		name : ${i.name}<br>
		email : ${i.email}<br>
		<hr>
	</c:forEach>
	<!-- delims : "," 무시/ 기호들을 인식하지 ㅇ낳음 -->
	<c:forTokens items="홍길동,010-111-2222,서울" delims="," var="sel">
		${sel}<br>
	</c:forTokens>
 	

</body>
</html>