<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//w3c//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>������Ʈ �α���</title>
</head>
<body>
	<center>
	<!--LoginProc.jsp���� ������ �Ѿ  -->
		<form action="LoginProc.jsp" method="post"><!-- ����Ʈ�� get  post�� ���� -->
		<table width="400" border="1">
			<tr height="40" align="center">
				<td width="150">���̵�</td>
				<td width="250" align="center"><input type="text" name="id"></td>
			</tr>
			<tr height="40" align="center">
				<td width="150">�н�����</td>
				<td width="250" align="center"><input type="password" name="pass"></td>
			</tr>
			<tr height="40" align="center" bgcolor="yellow">
				<td colspan="2"><input type="submit" value="�α���"></td>
			</tr>
		</table>
		</form>
	</center>
</body>
</html>