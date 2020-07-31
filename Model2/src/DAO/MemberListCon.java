package DAO;


import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberListCon.do")
public class MemberListCon extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}
	
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			req.setCharacterEncoding("UTF-8"); //ÇÑ±Û ±úÁü ¹æÁö
			
			MemberJoinDAO mdao= new MemberJoinDAO();
			Vector<MemberJoinBean> v=mdao.allSelectMember();
			req.setAttribute("vec",v);
			
			RequestDispatcher dis=req.getRequestDispatcher("MemberList.jsp");
			dis.forward(req, res);
			
		
		
	}

}
