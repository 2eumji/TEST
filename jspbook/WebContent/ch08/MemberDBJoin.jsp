<%@page import="model.MemberDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	//**취미(hobby) 부분은 별도로 읽어드려 다시 빈 클래스에 저장해야함(string으로 해놔서 하나만 기억함)
	String hobby[]=request.getParameterValues("hobby"); //배열이라 ParameterValues로 가져옴
	//배열에 있는 내용을 하나의 스트림으로 저장
	 String texthobby="";
	
	for(int i=0;i<hobby.length;i++){
		texthobby += hobby[i]+" ";
	} 
%>
	<!-- model.MemberDBBean 클래스의 객체 mbean으로 자바빈 선언 -->
	<jsp:useBean id="mbean" class="model.MemberDBBean" scope="page">
	<!-- 자바 빈 설정  -->
		<jsp:setProperty property="*" name="mbean"/><!-- 매핑시킴 -->
	</jsp:useBean>
<%
	//기존 hobby에는 한가지만 들어갈수있게 되어있으므로 배열을 담아둔 texthobby로 다시 셋팅해줌
	mbean.setHobby(texthobby); 
	
	/* String url="jdbc:oracle:thin:@localhost:1521:orcl"; //접속 url
	String user="system";
	String pass="12341234"; */
	
	MemberDAO mdao=new MemberDAO(); //DAO객체 생
	mdao.insertMember(mbean); //insert into 
	
	//회원가입이 되면 회원정보를 보여주는 페이지로 이동시킴
	response.sendRedirect("MemberList.jsp");

%>
	<%-- <h2>당신의 아이디 = <%= mbean.getId() %></h2>
	<h2>당신의 취미는 = <%= mbean.getHobby() %></h2> --%>
	접속 성공!!
	
	

</body>
</html>