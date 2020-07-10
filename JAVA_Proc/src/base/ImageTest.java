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
		
		//이미지
		ImageIcon img=new ImageIcon("dog1.jpg");
		JLabel jl=new JLabel(img); //JLabel에만 ImageIcon을 추가할 수 있다.
		jl.setBounds(130,130,225,225); //원본 이미지의 width,height을 알아야함
		
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
