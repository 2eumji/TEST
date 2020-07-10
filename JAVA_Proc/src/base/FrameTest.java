package base;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("첫 프레임");//프레임 제목
		frame.setBounds(200,100,400,300);//(창시작x위치,y위치,width값,height값)
		
		System.out.println(frame.getBounds().getWidth()); //double형식
		System.out.println(frame.getBounds().getHeight()); //int형식
		
		frame.setBackground(Color.darkGray);
		
		frame.setVisible(true);
		
	}

}
