//������ ���ּ� ��ӹ޾Ƽ� �ʿ��Ѱ͸� ���
package base;
import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass  {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x��ư ����");
		System.exit(0);
	}
	
	
	
}
