<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>forward_action.jsp���� footer.jspȣ��</h2>
	forward_action.jsp�� ��� ������ ��µ��� �ʽ��ϴ�.
	<!-- Declaration ������ ����Ͽ� ���� -->
	<%!
		int a=10;
	%>
	<jsp:forward page="footer.jsp">
		<jsp:param name="email" value="test@test.net" />
		<jsp:param name="tel" value="000-0000-0000"/>
	</jsp:forward>
</body>
</html>