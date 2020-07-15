package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * File : CalcServlet.java
 * Desc : ���� ����
 * @author ȫ�浿(dinfree@dinfree.com)
 */
@WebServlet(description = "Calc1 ����", urlPatterns = { "/CalcServlet2" })
public class CalcServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// GET ��û�� ó���ϱ� ���� �޼���
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost()�� ������.
		doPost(request, response);
	}

	// POST ��û�� ó���ϱ� ���� �޼���
	// doGet()������ ȣ���ϰ� �ֱ� ������ ��� ��û�� doPost()���� ó���Ǵ� �����̴�.
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���� ����
		int  num1,num2;
		int result;
		String op;

		// Ŭ���̾�Ʈ ����� ���޵� ����Ʈ�� ���� Ÿ�� ������ ĳ���ͼ� ����
		//application/msword
		response.setContentType("text/html; charset=UTF-8");

		//Ŭ���̾�Ʈ ������ ���� ��� ��Ʈ�� Ȯ��<%= %>�� ��ü Ŭ����
		PrintWriter out = response.getWriter();
		
		// HTML ���� ���� ���޵� num1, num2 �Ķ���� ���� ������ �Ҵ��Ѵ�.
		//�̶� getParameter() �޼���� ���ڿ��� �����ϹǷ� ������ �������� ��� Integer.parseInt() �� ���� int�� ��ȯ �Ѵ�.
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		// CalcŬ������ ��ü ������ ������� �������� �޼��带 ȣ���� ����� �޾� �´�.
		Calc calc =new Calc(num1,num2,op);
		result = calc.getResult();

		// ��� ��Ʈ���� ���� ȭ���� ���� �Ѵ�.
		out.println("<HTML>");
		out.println("<HEAD><TITLE>����</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>�����</H2>");
		out.println("<HR>");
		out.println(num1+" "+op+" "+num2+" = "+result);
		out.println("</BODY></HTML>");
	}


}
