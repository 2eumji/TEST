package calender;
import java.awt.event.ActionEvent;

/** ClearMenuItem clears a text area 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class ClearMenuItem extends EditorMenuItem
{ public ClearMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().clear(); }
}

