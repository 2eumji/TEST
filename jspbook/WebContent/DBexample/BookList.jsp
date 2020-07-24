<%@page import="model.BookDBBean"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>BOOKLIST</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	
	String url="jdbc:oracle:thin:@localhost:1521:orcl"; //접속 url
	String user="madang";
	String pass="madang";
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	Vector<BookDBBean> v=new Vector<BookDBBean>();
	try { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url, user, pass);
		
		String sql="select * from book order by bookid";
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			BookDBBean bean=new BookDBBean();
			bean.setBookid(rs.getInt(1));
			bean.setBookname(rs.getString(2));
			bean.setPublisher(rs.getString(3));
			bean.setPrice(rs.getInt(4));
			v.add(bean);
		}
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
%>
	<div align="center">
		<table width="600" border="1" cellpadding="5" cellspacing="0">
			<tr height="40">
				<td align="center">BOOKID</td>
				<td align="center">BOOKNAME</td>
				<td align="center">PUBLISHER</td>
				<td align="center">PRICE</td>
			</tr>
			<%
			for(int i=0;i<v.size();i++){
				BookDBBean Bbean = v.get(i);//박스에서 데이터를 꺼내서 화면에 출력하기위해 저장
			%>
			<tr height="40">
				<td align="center"><%=Bbean.getBookid() %></a></td>
				<td align="center"><%=Bbean.getBookname() %></td>
				<td align="center"><%=Bbean.getPublisher() %></td>
				<td align="center"><%=Bbean.getPrice() %></td>
			</tr>
		<% } %>
		</table>
	</div>

</body>
</html>