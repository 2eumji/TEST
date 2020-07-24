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
	//Main값 (중앙에 바뀌는 페이지부분)을 변경해 주기 위해서  request객체를 이용하여 center값으로 받아옴.
	String center=request.getParameter("center");
	//
	
	if(center==null){
		center="Center.jsp";
	}else{
		if(center.equals("1"))center="Choan_camping.jsp";
		else if(center.equals("2"))center="CampingInTheCity.jsp";
		else if(center.equals("3"))center="Choan_camping.jsp";
		else if(center.equals("4"))center="CampingInTheCity.jsp";
		else if(center.equals("5"))center="Choan_camping.jsp";
		else if(center.equals("6"))center="CampingInTheCity.jsp";
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
			<%-- <td align="center" width=250>
				<jsp:include page="Left.jsp"></jsp:include>
			</td> --%>
		<!--center부분  -->
			<td align="center" width=900>
				<jsp:include page="<%=center%>"></jsp:include>
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