<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch06 : selProduct.jsp</title>
</head>
<% request.setCharacterEncoding("UTF-8");
	session.setAttribute("username", request.getParameter("username"));//아이디를 가져와서 아이디로 접속(로그인)
%> 
<body>
	<div align="center">
        <h2>상품선택</h2>
        <hr>
        <%=session.getAttribute("username") %>님 환영합니다.!!
        <hr>
        <form action="add.jsp" name="form1" method="post">
        	<select name="product">
        		<option>사과</option>
        		<option>귤</option>
        		<option>파인애플</option>
        		<option>자몽</option>
        		<option>레몬</option>
        	</select>
         	<input type="submit" value="추가">
        </form>
        <br>
        <a href="checkOut.jsp">계산</a>
        
    </div>
</body>
</html>