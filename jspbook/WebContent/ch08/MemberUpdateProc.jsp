<%@page import="java.net.URLEncoder"%>
<%@page import="model.MemberDBBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
  	request.setCharacterEncoding("UTF-8");
  %>
  <jsp:useBean id="mbean" class="model.MemberDBBean">
  	 <jsp:setProperty name="mbean" property="*" />
  </jsp:useBean>
<%
	MemberDAO mdao=new MemberDAO();
	
	String pass=mdao.getPass(mbean.getId()); //mbean.getID 에 대한  패스워드 가져오기
	
	//수정하기 위해서 작성한 패스워드 값과 기존데이터 베이스에서 가져온 값(pass)을 비교
	if(mbean.getPass1().equals(pass)){
		mdao.updateMember(mbean);
		response.sendRedirect("MemberInfo.jsp?id="+URLEncoder.encode(mbean.getId(),"UTF-8"));
	}else{
		%> 
		<script type="text/javascript">
			alert("패스워드가 일치하지 않습니다")
			history.go(-1);
		</script>
	<%
	}
	%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>