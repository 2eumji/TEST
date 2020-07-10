//�޴��� 
package base;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {
	public static void main(String[] args) {
		//�����ӿ� �޴� ���̱�
		Frame f=new Frame("�޴�");
		f.setSize(300, 200);
		
		MenuBar menuBar=new MenuBar(); //�޴��� ��������
		Menu mFile=new Menu("����");//�޴� �ϳ�����(����)
		MenuItem miNew=new MenuItem("New"); //����-�����޴� ����
		MenuItem miOpen=new MenuItem("Open");
		MenuItem miSave=new MenuItem("Save");
		
		Menu print=new Menu("Print");
		MenuItem printSetup=new MenuItem("����Ʈ �¾�");
		MenuItem printPre=new MenuItem("�̸�����");
		
		print.add(printSetup);
		print.add(printPre);
		
		MenuItem miClose=new MenuItem("Close");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		menuBar.add(mFile);
		
		f.setMenuBar(menuBar);
		f.setVisible(true);
		
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}