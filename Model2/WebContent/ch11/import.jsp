<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch11 : import</title>
</head>
<body bgcolor="#ffffff">
	<h3>&lt;c:import&gt;</h3>
	다음은 import를 이용해 포함한 것입니다. <hr>
	<c:import url="set.jsp" var="myurl" /> <!-- 클래스를 임포트하는것과 같다 -->
	<c:out value="${myurl}" escapeXml="false"/>
	<hr>
	soldesk.wooripage.net
	<c:import url="https://www.daum.net" var="myurl2" />
	<c:out value="${myurl2}" escapeXml="false"/>
	
</body>
</html>