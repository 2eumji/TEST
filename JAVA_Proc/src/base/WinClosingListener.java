//원형만 놔둬서 상속받아서 필요한것만 사용
package base;
import java.awt.event.WindowEvent;

public class WinClosingListener extends ListenerClass  {

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x버튼 누름");
		System.exit(0);
	}
	
	
	
}
