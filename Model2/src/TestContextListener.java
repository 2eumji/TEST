

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestContextListener implements ServletContextListener {

    public TestContextListener() {
       
    }
    
    //������ ���� �޼ҵ�
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext ctx=	arg0.getServletContext();
    	//Book ��ü�� ����� appication scope�� ����
    	Book mybook=new Book("�ڹ������α׷���","�̹���",20000,"�ֵ���ũ");
    	ctx.setAttribute("book", mybook);
    	
    	System.out.println("TestContextListener ���۵�...");
    	
    }
	
    //�Ҹ�
    public void contextDestroyed(ServletContextEvent sce)  { 
       
    }

   
	
}
