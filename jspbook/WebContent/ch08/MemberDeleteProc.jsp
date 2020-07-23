<%@page import="java.net.URLEncoder"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="mbean" class="model.MemberDBBean">
	<jsp:setProperty property="*" name="mbean"/>
</jsp:useBean>
<%
	MemberDAO mdao=new MemberDAO();
	String pass=mdao.getPass(mbean.getId());
	
	if(mbean.getPass1().equals(pass)){
		mdao.deleteMember(mbean.getId());
		response.sendRedirect("MemberList.jsp");
	}else{
		%> 
		<script type="text/javascript">
			alert("패스워드가 일치하지 않습니다")
			history.go(-1);
		</script>
	<%
	}
	%>
</body>
</html>