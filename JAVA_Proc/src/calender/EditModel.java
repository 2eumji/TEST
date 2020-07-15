package calender;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;

/** EditModel models a text area  
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class EditModel extends JTextArea
{
	private File file;

  /** EditModel builds the text area
	* @param file_name - the file name for saving
	* @param rows - the number of rows
	* @param cols - the number of columns  */
	public EditModel(String file_name, int rows, int cols)
	{
		super("", rows, cols);
		String initial_text = new String("");
		String temp;
		try
		{
			file = new File(file_name);
			if(file.exists()) {
				BufferedReader line = new BufferedReader(new FileReader(file));
				while( (temp =  line.readLine()) != null)	//파일에서 읽기
				{
					initial_text += temp + "\n";
				}
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	
		setText(initial_text);   // create the underlying JTextArea
		setLineWrap(true);
		setFont(new Font("굴림", Font.PLAIN, 14));
	}

  /** clear resets the text area to be empty */
	public void clear()
	{ setText(""); }

  /** save the text area to file */
	public void save() 
	{
		try
		{
			file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(getText());	//파일에 내용 쓰기
			writer.flush();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}