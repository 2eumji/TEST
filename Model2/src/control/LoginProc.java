package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginProc.do")//반드시 form태그의 action에 있는 파일명과 일치해야한다
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	//get방식이든 post방식이든 reqPro가 받아주겠다는 메소드
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//데이터 불러오기
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		//중간 테스트
		//System.out.println("id= "+id);
		
		//데이터 저장
		request.setAttribute("id", id);
		request.setAttribute("password", password);
		
		//데이터 요청정보를 jsp에 넘겨줌
		RequestDispatcher dis=request.getRequestDispatcher("LoginProc.jsp");
		dis.forward(request, response);//forward는 request,response값 모두 가지고 이동(sendredirect는 값을 못가져감)
		
		
		
	}

}
