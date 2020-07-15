<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Declaration 선언문 실습</title>
</head>
<body>
<!-- data메모리사용(전역변수) 메소드는 필수로 이쪽에 써야함 -->
<%!
	public void inCrement(){
}
%>
<%!
	int a=10; //멤버변수
%>
<!-- 스택메모리사용(지역변수) -->
<%
	int a=10; //지역변수
%>
<%
	//int a=1000; //지역변수
%>
</body>
</html>