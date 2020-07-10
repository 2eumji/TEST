package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//프레임에서 x버튼 이벤트를 등록
public class FrameTest5 {
	public static void main(String[] args) {
		MyFrame fr=new MyFrame();
		
		fr.setBackground(Color.pink);
		fr.setTitle("다섯번 째 사용자 프레임");
		
		
		//감지자는  WindowsListener를 구현하고 있는 MyEventListener클래스이다
		
		//객체지향(WindowsListener 전체)
		//fr.addWindowListener(new MyEventListener()); //MyEventListener 에 만든 이벤트 모두 적용됨
		
		//부분객체지향(WindowsListener를 상속받아 쓸부부만 갖다쓰기)
		//fr.addWindowListener(new WinClosingListener());
		
		//익명클래스로 이벤트사용(오직 하나)
		fr.addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X누름");
				System.exit(0);
			}
		});
	}
}
