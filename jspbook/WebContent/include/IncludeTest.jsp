<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% request.setCharacterEncoding("UTF-8");%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//처음 IncludeTest를 실행하면 camping이라는 파라미터 값이 넘어오지 않기떄문에 null처리
	String campurl="";
	String camping=request.getParameter("camping");
	
	if(camping==null){
		campurl="Choan_camping.jsp";
	}else{
		if(camping.equals("1"))campurl="Choan_camping.jsp";
		else if(camping.equals("2"))campurl="CampingInTheCity.jsp";
		else if(camping.equals("3"))campurl="Choan_camping.jsp";
		else if(camping.equals("4"))campurl="CampingInTheCity.jsp";
		else if(camping.equals("5"))campurl="Choan_camping.jsp";
		else if(camping.equals("6"))campurl="CampingInTheCity.jsp";
		else if(camping.equals("7"))campurl="Login.jsp";
		else if(camping.equals("8"))campurl="Join.jsp";
	}
%>
<center>
	<table width="1200" border=1>
		<!--Top부분  -->
		<tr height=100>
			<td align="center" colspan=2>
				<jsp:include page="Top.jsp"></jsp:include>
			</td>
		</tr>
		<!--Left부분  -->
		<tr height=500>
			<td align="center" width=250>
				<jsp:include page="Left.jsp"></jsp:include>
			</td>
		<!--center부분  -->
			<td align="center" width=900>
				<jsp:include page="<%=campurl%>"></jsp:include>
			</td>
		</tr>
		<!--Bottom부분  -->
		<tr height="100">
			<td align="center"  colspan=2>
				<jsp:include page="Bottom.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</center>
</body>
</html>