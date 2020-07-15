package calender;
import java.awt.event.ActionEvent;

/** SaveMenuItem saves a text area 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class SaveMenuItem extends EditorMenuItem
{ public SaveMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().save(); }
}