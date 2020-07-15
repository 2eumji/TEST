package calender;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/** DiaryFrame shows a diary 
  *	@author Park Sung Jae
  *	@version 0.1 2001.12.16 */
public class DiaryFrame extends JFrame implements UpdateableView
{	private DiaryModel calendar;   // the model; 
	
	private DateButton[] button;  // the buttons on the face of the view
	private JLabel titleLabel;
	private JTextField yearField;
	private Choice monthChoice;

	
	/** Constructor DiaryFrame builds the view
	* @param cells - the model, a diary */
	public DiaryFrame(DiaryModel cells)
		{  
		calendar = cells;

		Toolkit theKit = getToolkit();				//윈도우 툴킷 구하기
		Dimension wndSize = theKit.getScreenSize();	//화켠 크기 구하기

		//위치는 화면 가운데, 크기는 화면 크기의 1/2 X 3/5
		setBounds(wndSize.width/4, wndSize.height/4,		//위치
						400, 600);	//크기

    	try	
		{
	    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	  	}
		catch(Exception e)
		{
			e.printStackTrace();
	  	}
		
		//상단의 년도와 달 이동 버튼 패널과 요일 레이블 패널
		JPanel upperPanel = new JPanel();	
		upperPanel.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		//상단의 년도와 달 이동 버튼 패널
		JPanel titlePanel = new JPanel(new FlowLayout());
		titlePanel.setBorder(BorderFactory.createLoweredBevelBorder()); //테두리
		titlePanel.add(new PrevMonthButton(" <  ", calendar, this)); 
		titleLabel = new JLabel();
		titleLabel.setForeground(Color.DARK_GRAY);
		titlePanel.add(titleLabel);
		titlePanel.add(new NextMonthButton("  > ", calendar, this));
		
		upperPanel.add(titlePanel, BorderLayout.NORTH);


		
		//	//상단의 요일 라벨 패널, 가운데 날짜 버튼 패널
		JPanel datePanel = new JPanel(new GridLayout(7, 7));
		datePanel.setBorder(BorderFactory.createRaisedBevelBorder()); //테두리
		JLabel label;
		datePanel.add(label = new JLabel("    Sun"));
		label.setForeground(Color.red);
		datePanel.add(label = new JLabel("    Mon"));
		datePanel.add(label = new JLabel("   Tue"));
		datePanel.add(label = new JLabel(" Wed"));
		datePanel.add(label = new JLabel("   Thu"));
		datePanel.add(label = new JLabel("    Fri"));
		datePanel.add(label = new JLabel("   Sat")); 
		label.setForeground(Color.blue);
		button = new DateButton[DiaryModel.NUM_CELL];
		for( int i = 0; i < button.length; i++ )
		{
			button[i] = new DateButton(calendar);
			datePanel.add(button[i]);
		}

		
		//아래쪽 원하는 년도와 달로 직접 이동 패널
		JPanel bottomPanel = new JPanel(new FlowLayout());
		JLabel nameLabel = new JLabel("UltraDiary v0.1 made by PSJ      ");
		nameLabel.setFont(new Font("20th Century Font", Font.ITALIC, 14));
		bottomPanel.add(nameLabel);
		yearField = new JTextField("", 5);
		yearField.setBorder(BorderFactory.createLoweredBevelBorder());
		bottomPanel.add(yearField);
		bottomPanel.add(new JLabel(" / "));
		monthChoice = new Choice();
		for(int i = 1; i <= 12; i++) 
			monthChoice.addItem(String.valueOf(i)+" "); //원하는 달로 직접가기
		bottomPanel.add(monthChoice);
		bottomPanel.add(new JLabel("   "));
		bottomPanel.add(new AcceptButton("  Go  ", yearField, monthChoice, calendar, this));

		//Add top, center and bottom panel to content pane
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		content.add(upperPanel, BorderLayout.NORTH);
		content.add(datePanel , BorderLayout.CENTER);
		content.add(bottomPanel , BorderLayout.SOUTH);

		update();  // initialize the pieces with their numbers

		addWindowListener(new ExitController()); // activates X-button
		setTitle("UltraDiary");
		setVisible(true);
	}

  /** update  consults the model and repaints each button */
	public void update()
	{
		CellFace[] cell = calendar.contents();
	  	for(int i = 0; i < button.length; i++)
	  	{ 
			button[i].setText(cell[i].getValue());		//날짜버튼의 내용 지정
			button[i].setForeground(cell[i].getColor());//날짜버튼의 색 지정
			if (button[i].getText().equals(""))
				button[i].setVisible(false);	//공백 날짜 버튼 안보이게
			else
				button[i].setVisible(true);		//공백이 아닌 날짜 버튼 보이게
	  	}
		
		int year = calendar.getYear();
		int month = calendar.getMonth();

		//상단패널의 년도와 달 갱신
		titleLabel.setText("     " + year + "  /  " + (month + 1) + "     ");
		yearField.setText(new Integer(year).toString());	//년도 필드 갱신
		monthChoice.select(month);	//달이동 쵸이스 갱신
	
	}
 }