<!-- 데이터베이스 끌어오기 -->
<%@ tag import="model2.ch10.Product"%>
<%@ tag body-content="scriptless" pageEncoding="UTF-8"%>

<jsp:useBean id="product" class="model2.ch10.Product" />
<!-- 애트리뷰트 선언 -->
<%@ attribute name="bgcolor" %> 
<%@ attribute name="border" %>
<h2><jsp:doBody /></h2>
<table border="${border}" bgcolor="${bgcolor}" width="150">
	<%
		for(String item:product.getProductList()){
			out.println("<tr><td>"+item+"</td></tr>");
		}
	%>
</table>

