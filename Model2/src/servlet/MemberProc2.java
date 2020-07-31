package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MProc2")
public class MemberProc2 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}
	
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");
	
		//빈에 폼에서 받은 항목들 셋팅
		MemberBean bean=new MemberBean();
		bean.setId(req.getParameter("id"));
		bean.setPass(req.getParameter("pass"));
		bean.setName(req.getParameter("name"));
		bean.setPhone(req.getParameter("phone"));
		bean.setEmail(req.getParameter("email"));
		
		//req객체에 bean클래스를 담는다
		req.setAttribute("bean", bean);
		//jsp로 보냄
		RequestDispatcher dis=req.getRequestDispatcher("MemberView.jsp"); //보낼 jsp페이지 
		dis.forward(req,res);
		
	}

}
