<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch04:include action �׽�Ʈ</title>
</head>
<body>
	<h2>include_action.jsp���� footer.jspȣ��</h2>
	====��������� include_action.jsp���� ����ϴ� �޼����Դϴ�.
	<hr>
	<jsp:include page="footer.jsp">
		<jsp:param name="email" value="test@test.net" />
		<jsp:param name="tel" value="000-0000-0000"/>
		
	</jsp:include>

</body>
</html>