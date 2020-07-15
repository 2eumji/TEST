<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%-- <%

for(int i=1;i<=9;i++){
	for(int j=1;j<=9;j++){
		System.out.printf("%2d * %2d =%2d ",j,i,i*j);
	}System.out.println();
}

%> --%>

<%

for(int i=1;i<=9;i++){
	for(int j=1;j<=9;j++){

%>
	<%=j %> * <%=j %> = <%=i*j %> &nbsp; 

	<% } %><br>
<%
} 
%>


</body>
</html>