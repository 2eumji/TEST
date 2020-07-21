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
	<center>
		 <ul class="topmenu">
	        <li><a href="IncludeTest.jsp?camping=7">로그인</a></li>
	        <li><a href="IncludeTest.jsp?camping=8">회원가입</a></li>
	    </ul>
		<table width="1200" border="0">
			<tr height="100">
				<td colspan="2" align="center" width="260">
					<a href="IncludeTest.jsp"><img alt="" src="C:\Users\soldesk\git\TEST\jspbook\WebContent\img/logo.png"></a>
				</td>
				<td align="center" colspan="4">
					<font size="10" color="#444444">My Own Spring Camp</font>
				</td>
			</tr>
			<tr height="50">
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=1" style="text-decoration:none;font-size:1.3em">Tent</a>
				</td>
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=2" style="text-decoration:none;font-size:1.3em">Chair</a>
				</td>
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=3" style="text-decoration:none;font-size:1.3em">Dishware</a>
				</td>
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=4" style="text-decoration:none;font-size:1.3em">Sleeping</a>
				</td>
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=5" style="text-decoration:none;font-size:1.3em">Lantern</a>
				</td>
				<td width="130" align="center">
					<a href="IncludeTest.jsp?camping=6" style="text-decoration:none;font-size:1.3em">Table</a>
				</td>
			</tr>	
		</table>
	</center>

</body>
</html>