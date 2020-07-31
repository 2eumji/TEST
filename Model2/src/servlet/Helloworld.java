package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Helloworld")
public class Helloworld extends HttpServlet {
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//jsp쪽으로 넘겨서 화면에 출력
		String msg="Hello World";
		Integer data=07;
		
		req.setAttribute("msg", msg);
		req.setAttribute("data", data);
		
		//servlet에서 jsp를 호출
		RequestDispatcher dis=req.getRequestDispatcher("Helloworld.jsp");
		dis.forward(req, res);
		
		
	}

}
