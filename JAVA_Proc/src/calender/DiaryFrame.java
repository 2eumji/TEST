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

		Toolkit theKit = getToolkit();				//������ ��Ŷ ���ϱ�
		Dimension wndSize = theKit.getScreenSize();	//ȭ�� ũ�� ���ϱ�

		//��ġ�� ȭ�� ���, ũ��� ȭ�� ũ���� 1/2 X 3/5
		setBounds(wndSize.width/4, wndSize.height/4,		//��ġ
						400, 600);	//ũ��

    	try	
		{
	    	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	  	}
		catch(Exception e)
		{
			e.printStackTrace();
	  	}
		
		//����� �⵵�� �� �̵� ��ư �гΰ� ���� ���̺� �г�
		JPanel upperPanel = new JPanel();	
		upperPanel.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
		//����� �⵵�� �� �̵� ��ư �г�
		JPanel titlePanel = new JPanel(new FlowLayout());
		titlePanel.setBorder(BorderFactory.createLoweredBevelBorder()); //�׵θ�
		titlePanel.add(new PrevMonthButton(" <  ", calendar, this)); 
		titleLabel = new JLabel();
		titleLabel.setForeground(Color.DARK_GRAY);
		titlePanel.add(titleLabel);
		titlePanel.add(new NextMonthButton("  > ", calendar, this));
		
		upperPanel.add(titlePanel, BorderLayout.NORTH);


		
		//	//����� ���� �� �г�, ��� ��¥ ��ư �г�
		JPanel datePanel = new JPanel(new GridLayout(7, 7));
		datePanel.setBorder(BorderFactory.createRaisedBevelBorder()); //�׵θ�
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

		
		//�Ʒ��� ���ϴ� �⵵�� �޷� ���� �̵� �г�
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
			monthChoice.addItem(String.valueOf(i)+" "); //���ϴ� �޷� ��������
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
			button[i].setText(cell[i].getValue());		//��¥��ư�� ���� ����
			button[i].setForeground(cell[i].getColor());//��¥��ư�� �� ����
			if (button[i].getText().equals(""))
				button[i].setVisible(false);	//���� ��¥ ��ư �Ⱥ��̰�
			else
				button[i].setVisible(true);		//������ �ƴ� ��¥ ��ư ���̰�
	  	}
		
		int year = calendar.getYear();
		int month = calendar.getMonth();

		//����г��� �⵵�� �� ����
		titleLabel.setText("     " + year + "  /  " + (month + 1) + "     ");
		yearField.setText(new Integer(year).toString());	//�⵵ �ʵ� ����
		monthChoice.select(month);	//���̵� ���̽� ����
	
	}
 }