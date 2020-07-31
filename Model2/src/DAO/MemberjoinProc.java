package DAO;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/proc.do")
public class MemberjoinProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req,res);
	}
	
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8"); //한글 깨짐 방지
		
		MemberJoinBean bean=new MemberJoinBean();
		
		bean.setId(req.getParameter("id"));
		String pass1=req.getParameter("pw1");
		String pass2=req.getParameter("pw2");
		bean.setPw1(pass1);
		bean.setPw2(pass2);
		bean.setEmail(req.getParameter("email"));
		bean.setGender(req.getParameter("gender"));
		bean.setAddress(req.getParameter("address"));
		bean.setTel(req.getParameter("tel"));
		//복수정보 받아올때===============================
		String hobby[]=req.getParameterValues("hobby");
		String data="";
		for (String string: hobby) {
			data+=string+" "; //하나의 스트링 데이터 연결
		}
		bean.setHobby(data);
		//===========================================
		bean.setJob(req.getParameter("job"));
		bean.setAge(req.getParameter("age"));
		bean.setInfo(req.getParameter("info"));
		
		req.setAttribute("bean", bean);

		if(pass1.equals(pass2)) {
			//비밀번호가 일치 했을때 insertMember로 오라클에 저장하고
			MemberJoinDAO mdao=new MemberJoinDAO();
			mdao.insertMember(bean);
			
			//리스트 페이지로 넘김-->전체리스트보기(벡터에담기위헤 중간서블릿페이지로 넘김)
			RequestDispatcher dis=req.getRequestDispatcher("MemberListCon.do");
			dis.forward(req, res);
		}else {
			//비밀번호가 일치하지 않았을때 넘겨주는 페이지
			req.setAttribute("msg", "패스워드가 일치하지 않습니다.");
			RequestDispatcher dis=req.getRequestDispatcher("LoginError.jsp");
			dis.forward(req, res);
		}
		
		
		
		
		
		
		
	}
}
