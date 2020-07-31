<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : out</title>
</head>
<body bgcolor="#ffffff">
	<h3>&lt;c:out&gt;</h3>
	<table border="1" cellpadding="5" cellspacing=0>
		<!-- for(String member:members) -->
		<c:forEach var="member" items="${members}" >
			<tr>
				<td>${member.name}</td>
				<td>
					<c:out value="${member.email}" escapeXml="false">
						<font color="red">email 없음</font>
					</c:out>
				</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>