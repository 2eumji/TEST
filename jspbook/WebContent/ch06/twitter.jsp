<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.text.*"%> <!--임포트  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
//한글 캐릭터셋 변환
request.setCharacterEncoding("UTF-8");
//form에서 전달된 msg값을 가지고 옴
String msg=request.getParameter("msg");
//user에 있는 값을 세션에 저장된 로그인 사용자 이름으로 계승
Object username=session.getAttribute("user");
//application에서 msgs로 저장된 ArrayList생성 
ArrayList<String> msgs=(ArrayList<String>)application.getAttribute("msgs");
//msgs가 null인 경우 새로운 ArrayList생성 
if(msgs==null){
	msgs=new ArrayList<String>();
	application.setAttribute("msgs", msgs); //어플리케이션으로 셋팅
}

// 사용자 이름, 메세지 , 날짜 순서로 출력
Date date=new Date();
SimpleDateFormat f=new SimpleDateFormat("E MMM DD HH:mm", Locale.KOREA);
//msgs에 사용자 메시지를 형식 맞게 추가
msgs.add(username+" :: "+msg+" , "+f.format(date));
//톰캣 콘솔에 로그기록 로깅
application.log(msg+"추가됨");
//목록 화면으로 리다이렉션
response.sendRedirect("twitter_list.jsp");

%>
