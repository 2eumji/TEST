package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample {
	public static void main(String[] args) {
		Frame f=new Frame("질문");
		f.setSize(500,250);
		f.setLayout(null);
		f.setLocation(400,100);
		
		Choice area=new Choice();
		area.add("지역선택");
		area.add("서울");
		area.add("경기");
		area.add("인천");
		area.add("광주");
		area.add("대구");
		area.add("대전");
		area.add("부산");
		
		//셀렉트박스의 크기와 위치 설정
		area.setSize(150,0);
		area.setLocation(50, 100);//초이스 좌표
		
		area.addItemListener(new ChoiceHandler());
		
		f.add(area);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
