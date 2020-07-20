<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch06 : out.jsp</title>
</head>
<body>

<div align="center">
<h2>out 내장객체의 사용</h2>
<hr>
1. 설정된 버퍼 크기 : <%= out.getBufferSize() %> <br>
2. 남아있는 버퍼크기 :<%= out.getRemaining() %><br>
<% out.flush(); %>
3. flush 후 남아있는 버퍼크기 : <%= out.getRemaining() %><br>
<% out.clear(); %>
4.clear후 남아있는 버퍼크기 <%= out.getRemaining() %><br>
<% out.close(); %>
5.close 후 남아있는 버퍼크기 : <%= out.getRemaining() %><br>
</div>

</body>
</html>