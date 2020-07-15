package animalHospital;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.table.DatePickerCellEditor;

public class DateTimePicker extends JFrame{
	
	JTable userTable;
	JScrollPane listJs;
	JPanel listPanel;
	
	Vector<String> userColumn= new Vector<String>();
	DefaultTableModel model;
	Vector<String> userRow;
	
	public DateTimePicker(String title) {
		super(title);
		
		userColumn.addElement("날짜선택");
		userColumn.addElement("날짜");
		
		model=new DefaultTableModel(userColumn,0);
		userTable = new JTable(model);
		
		setBounds(100,100,200,200);
		setResizable(false);
		
		listPanel=new JPanel();
		listPanel.setLayout(new BorderLayout());
		listJs=new JScrollPane(userTable);
		listPanel.add(listJs,BorderLayout.CENTER);
		
		add(listPanel);
		
		userTable.getColumnModel().getColumn(2).setCellEditor(new DatePickerCellEditor());
		
		
		setVisible(true);
		
		userRow= new Vector<String>();
		userRow.addElement("홍길동");
		userRow.addElement("의적");
		model.addRow(userRow);
	}
	 
	public static void main(String[] args) {
		
		
		DateTimePicker ok=new DateTimePicker("Exmaple One");
		

	}

}
