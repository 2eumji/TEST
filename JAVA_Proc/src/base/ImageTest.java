package base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		Frame f= new Frame();
		f.setLayout(null);
		
		f.setBounds(500, 100, 500, 500);
		
		//�̹���
		ImageIcon img=new ImageIcon("dog1.jpg");
		JLabel jl=new JLabel(img); //JLabel���� ImageIcon�� �߰��� �� �ִ�.
		jl.setBounds(130,130,225,225); //���� �̹����� width,height�� �˾ƾ���
		
		f.add(jl);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}