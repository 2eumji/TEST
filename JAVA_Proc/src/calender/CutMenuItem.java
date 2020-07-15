package calender;
import java.awt.event.ActionEvent;

/** CutMenuItem  cuts the selected text from the text area. 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class CutMenuItem extends EditorMenuItem
{ public CutMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().cut(); }
}

