package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("프린트 셋업")) {//getActionCommand() 어떤글자가 써있냐
			System.out.println("프린트 셋업");
		}else if(e.getActionCommand().equals("Close")){
			System.exit(0);
		}
		
	}
}
