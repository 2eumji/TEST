package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceExample {
	public static void main(String[] args) {
		Frame f=new Frame("����");
		f.setSize(500,250);
		f.setLayout(null);
		f.setLocation(400,100);
		
		Choice area=new Choice();
		area.add("��������");
		area.add("����");
		area.add("���");
		area.add("��õ");
		area.add("����");
		area.add("�뱸");
		area.add("����");
		area.add("�λ�");
		
		//����Ʈ�ڽ��� ũ��� ��ġ ����
		area.setSize(150,0);
		area.setLocation(50, 100);//���̽� ��ǥ
		
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
