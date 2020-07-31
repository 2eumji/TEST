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
	
		//�� ������ ���� �׸�� ����
		MemberBean bean=new MemberBean();
		bean.setId(req.getParameter("id"));
		bean.setPass(req.getParameter("pass"));
		bean.setName(req.getParameter("name"));
		bean.setPhone(req.getParameter("phone"));
		bean.setEmail(req.getParameter("email"));
		
		//req��ü�� beanŬ������ ��´�
		req.setAttribute("bean", bean);
		//jsp�� ����
		RequestDispatcher dis=req.getRequestDispatcher("MemberView.jsp"); //���� jsp������ 
		dis.forward(req,res);
		
	}

}
