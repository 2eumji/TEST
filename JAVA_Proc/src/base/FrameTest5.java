package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//�����ӿ��� x��ư �̺�Ʈ�� ���
public class FrameTest5 {
	public static void main(String[] args) {
		MyFrame fr=new MyFrame();
		
		fr.setBackground(Color.pink);
		fr.setTitle("�ټ��� ° ����� ������");
		
		
		//�����ڴ�  WindowsListener�� �����ϰ� �ִ� MyEventListenerŬ�����̴�
		
		//��ü����(WindowsListener ��ü)
		//fr.addWindowListener(new MyEventListener()); //MyEventListener �� ���� �̺�Ʈ ��� �����
		
		//�κа�ü����(WindowsListener�� ��ӹ޾� ���κθ� ���پ���)
		//fr.addWindowListener(new WinClosingListener());
		
		//�͸�Ŭ������ �̺�Ʈ���(���� �ϳ�)
		fr.addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X����");
				System.exit(0);
			}
		});
	}
}
