package model2.ch10;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MsgTagSimpleHandler extends SimpleTagSupport {
              
	public void doTag() throws IOException {
		JspWriter out=getJspContext().getOut();
		out.println("Ŀ���� �±� �ڵ鷯 ��� �޼��� : Hello");
	}
}


