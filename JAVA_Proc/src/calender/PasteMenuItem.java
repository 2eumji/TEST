package calender;
import java.awt.event.ActionEvent;

/** PasteMenuItem moves contents of the clipboard into the text area 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class PasteMenuItem extends EditorMenuItem
{ public PasteMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().paste(); }
}

