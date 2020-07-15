package calender;
import java.awt.event.ActionEvent;

/** CopyMenuItem  copies selected text into the clipboard 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class CopyMenuItem extends EditorMenuItem 
{ public CopyMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().copy(); }
}

