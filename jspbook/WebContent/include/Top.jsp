<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% request.setCharacterEncoding("UTF-8");%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Top</title>
<style type="text/css">
	.topmenu{float:right;}
	.topmenu li{float:left; paiddng-right:30px;list-style:none;}
	a{text-decoration:none;}
</style>
</head>
<body>
<%
	//로그아웃 클릭시 파라미터를 통해서 로그아웃판단
	String logout=request.getParameter("logout");
	
	if(logout != null){ //로그인 상태
		//id에 null값을 부여해야 로그아웃이 됨
		session.setAttribute("id", null);		
		//세션 유지시간을 kill
		session.setMaxInactiveInterval(0);
	}

	//세션을 통해여 id를 읽어들임
	String id=(String)session.getAttribute("id");
	//로그인이 되지않은 상태 session값을 null처리
	if(id==null){
		id="Join";
	}
%>
	<center>
		 <div class="topmenu">
		 <%
		 	if(id.equals("Join")){
		 		 %>		
		 	<%=id%> <button onclick="location.href='SessionMain.jsp?center=SessionLoginForm.jsp'">로그인</button>
		<%}else{ %>
			<%=id%> <button onclick="location.href='SessionMain.jsp?logout=1'">로그아웃</button>
			<%}%>
	    </div>
		<table width="1200" border="0">
			<tr height="100">
				<td colspan="2" align="center" width="260">
					<a href="SessionMain.jsp"><img alt="" src="C:\Users\soldesk\git\TEST\jspbook\WebContent\img/logo.png"></a>
				</td>
				<td align="center" colspan="4">
					<font size="10" color="#444444">My Own Spring Camp</font>
				</td>
			</tr>
			<tr height="50">
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=1" style="text-decoration:none;font-size:1.3em">Tent</a>
				</td>
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=2" style="text-decoration:none;font-size:1.3em">Sleeping</a>
				</td>
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=3" style="text-decoration:none;font-size:1.3em">Dishware</a>
				</td>
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=4" style="text-decoration:none;font-size:1.3em">Chair</a>
				</td>
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=5" style="text-decoration:none;font-size:1.3em">Lantern</a>
				</td>
				<td width="130" align="center">
					<a href="SessionSub.jsp?center=6" style="text-decoration:none;font-size:1.3em">Table</a>
				</td>
			</tr>	
		</table>
	</center>

</body>
</html>