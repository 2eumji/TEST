<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table border=1 cellspaing="5">
		<c:forEach var="i" begin="1" end="9">
			<tr height="40">
				<c:forEach var="j" begin="2" end="9">
					<td align="center" width="100">${j}*${i}=${j*i}</td>
				</c:forEach>
			</tr>
		</c:forEach>
</table>
</center>
</body>
</html>