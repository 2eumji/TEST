package base;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("ù ������");//������ ����
		frame.setBounds(200,100,400,300);//(â����x��ġ,y��ġ,width��,height��)
		
		System.out.println(frame.getBounds().getWidth()); //double����
		System.out.println(frame.getBounds().getHeight()); //int����
		
		frame.setBackground(Color.darkGray);
		
		frame.setVisible(true);
		
	}

}
