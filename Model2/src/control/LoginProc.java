package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginProc.do")//�ݵ�� form�±��� action�� �ִ� ���ϸ�� ��ġ�ؾ��Ѵ�
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	//get����̵� post����̵� reqPro�� �޾��ְڴٴ� �޼ҵ�
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//������ �ҷ�����
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		//�߰� �׽�Ʈ
		//System.out.println("id= "+id);
		
		//������ ����
		request.setAttribute("id", id);
		request.setAttribute("password", password);
		
		//������ ��û������ jsp�� �Ѱ���
		RequestDispatcher dis=request.getRequestDispatcher("LoginProc.jsp");
		dis.forward(request, response);//forward�� request,response�� ��� ������ �̵�(sendredirect�� ���� ��������)
		
		
		
	}

}
