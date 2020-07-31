

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestContextListener implements ServletContextListener {

    public TestContextListener() {
       
    }
    
    //리스너 실행 메소드
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext ctx=	arg0.getServletContext();
    	//Book 객체를 만들어 appication scope에 저장
    	Book mybook=new Book("자바웹프로그래밍","이미정",20000,"솔데스크");
    	ctx.setAttribute("book", mybook);
    	
    	System.out.println("TestContextListener 시작됨...");
    	
    }
	
    //소멸
    public void contextDestroyed(ServletContextEvent sce)  { 
       
    }

   
	
}
