<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
  	request.setCharacterEncoding("UTF-8");
	
	//체크박스 값 확인
	//out.write("아이디 저장 : "+request.getParameter("save"));
	
	//체크박스 값을 저장(유무)
	String save=request.getParameter("save");
	//아이디저장
	String id=request.getParameter("id");
	//체크박스가 체크되었으면 쿠키에 아이디를 저장
	if(save !=null){ //체크가 null이 아니라면(체크됨)
		//내장객체가 아니므로 쿠키 객체를 생성 :기본생성자 없음(key,value)가 기본임
		Cookie cookie=new Cookie("id",id); //"id"(아무이름)를 누르면 id(입력한아이디값)을 반환해줘
		//쿠키 유효시간
		cookie.setMaxAge(60*10); //10분
		//클라이언트쪽에서 서버에 넘겨줌
		response.addCookie(cookie);
	}
	out.write("쿠키 생성 완료!");
  %>
  <%= id %>님 반갑습니다.
</body>
</html>