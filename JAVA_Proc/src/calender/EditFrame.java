package calender;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

/** EditFrame displays a text editor with two menus and a text area.  
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class EditFrame extends JFrame
{ // the EditModel, a subclass of JTextArea, is the ``model'' for the frame:
	private String title;		//the title
	private EditModel buffer;	//the model of editor
	private static int count = 0;	//count number of text editor

  /** Constructor  EditFrame  builds the editor interface 
	* @param my_title the window title of text editor */
	public EditFrame(String my_title)
	{ // Create the ReplaceFrame, which appears when the user selects ``Replace'':
		title = my_title;
		
		count++;	//메모장 갯수 증가
		if (count > 10)
			count = 0;

		//메모장이 열릴때마다 위치를 변화시킨다
		setLocation(50 + count * 30, 50 + count * 30); //위치 

		buffer = new EditModel(title, 15, 30);
		Container cp = getContentPane();
	    cp.setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
	    JMenu file = new JMenu("File");     // defines the  "File"  menu
		file.add(new ClearMenuItem("New", buffer));
		file.add(new SaveMenuItem("Save", buffer));
		file.addSeparator();	//구분자 추가
		file.add(new QuitMenuItem("Exit", this));
		mbar.add(file);    // attach menu to menu bar
		JMenu edit = new JMenu("Edit");     // defines the  "Edit"  menu
		edit.add(new CutMenuItem("Cut", buffer));
		edit.add(new CopyMenuItem("Copy", buffer));
		edit.add(new PasteMenuItem("Paste", buffer));
		
		mbar.add(edit);
		setJMenuBar(mbar);  // attach menu bar to frame
		JScrollPane sp = new JScrollPane(buffer);  // embed into a scroll pane
		cp.add(sp, BorderLayout.CENTER);
		setTitle("Memo - " + title);
		pack();
		setVisible(true);
	}
}