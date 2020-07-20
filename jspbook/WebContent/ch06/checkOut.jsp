<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch06 : checkOut.jsp</title>
</head>
<% request.setCharacterEncoding("UTF-8");
%> 
<body>
	<div align=center>
		<h2>계산</h2>
		선택한 상품목록
		<hr>
		<%
		ArrayList<String> list=(ArrayList)session.getAttribute("productlist");
		
		if(list==null){ 
			%>
			<script>
			alert("선택한 상품이 없습니다.");
			history.go(-1);
			</script>
			<%		
		}else{
			for(Object productname:list){
				out.println(productname+"<br>");
			}
		}
		%>
	</div>

</body>
</html>