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
		
		req.setCharacterEncoding("UTF-8"); //�ѱ� ���� ����
		
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
		//�������� �޾ƿö�===============================
		String hobby[]=req.getParameterValues("hobby");
		String data="";
		for (String string: hobby) {
			data+=string+" "; //�ϳ��� ��Ʈ�� ������ ����
		}
		bean.setHobby(data);
		//===========================================
		bean.setJob(req.getParameter("job"));
		bean.setAge(req.getParameter("age"));
		bean.setInfo(req.getParameter("info"));
		
		req.setAttribute("bean", bean);

		if(pass1.equals(pass2)) {
			//��й�ȣ�� ��ġ ������ insertMember�� ����Ŭ�� �����ϰ�
			MemberJoinDAO mdao=new MemberJoinDAO();
			mdao.insertMember(bean);
			
			//����Ʈ �������� �ѱ�-->��ü����Ʈ����(���Ϳ�������� �߰������������� �ѱ�)
			RequestDispatcher dis=req.getRequestDispatcher("MemberListCon.do");
			dis.forward(req, res);
		}else {
			//��й�ȣ�� ��ġ���� �ʾ����� �Ѱ��ִ� ������
			req.setAttribute("msg", "�н����尡 ��ġ���� �ʽ��ϴ�.");
			RequestDispatcher dis=req.getRequestDispatcher("LoginError.jsp");
			dis.forward(req, res);
		}
		
		
		
		
		
		
		
	}
}
