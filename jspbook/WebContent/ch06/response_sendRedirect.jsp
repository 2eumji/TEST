<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- 페이지에 파라미터(폼입력값)을 함께 전송안함 즉: request.getParameter값을 못받음--%>
<% request.setCharacterEncoding("UTF-8"); %> <!-- 한글꺠짐방지 -->
<% response.sendRedirect("page_control_end.jsp"); %> <!-- 여러페이지를 거쳐왔을때 틀렸을때 값(param)을 다 버리고 첫페이지로 갈떄 -->