package calender;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

/** QuitMenuItem terminates the text editor.  
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class QuitMenuItem extends JMenuItem implements ActionListener
{
	private EditFrame frame;
	public QuitMenuItem(String label, EditFrame frame)
	{ 
		super(label);
		this.frame = frame;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{ frame.dispose(); }
}