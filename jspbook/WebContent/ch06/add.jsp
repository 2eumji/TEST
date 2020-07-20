<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%> <!-- 자바유틸임포트 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add.jsp</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8");
	
	//selProduct.jsp에서 값을 받아옴
	String productname=request.getParameter("product"); //하나씩 저장
	
	//productname의 데이터를 추가할 ArrayList 객체 생성
	//로그인상태에서 장바구니에 담는것이기때문에 session에서 받아야함
	ArrayList<String> list=(ArrayList)session.getAttribute("productlist");
	
	if(list==null){ //리스트에 아무것도 없으면  새로운 리스트 생성
		list=new ArrayList<String>();
		session.setAttribute("productlist", list);
	}//list 객체에 추가
	list.add(productname);
%> <script>
	alert("<%=productname%>이(가) 추가되었습니다.");
	history.go(-1); //이전페이지로
</script>
</body>
</html>