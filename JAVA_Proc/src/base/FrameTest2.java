package base;

import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String[] args) {
		JFrame fr=new JFrame("두 번째");
		fr.setSize(400, 400);//가로 세로 크기
		fr.setLocation(100, 100); //좌표 위치
		//JFrame특징
		//x버튼으로 프레임 닫기(프레임이 닫히면 메모리도 소멸)
		//일반 Frame에는 없는기능
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
}
