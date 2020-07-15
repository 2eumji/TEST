package animalHospital;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

import org.jdesktop.swingx.table.DatePickerCellEditor;

public class TestProj {

	public static void main(String[] args) {
		
		Frame f=new Frame("진료 예약");
		f.setBounds(200,100,350,700);
		
	
		JTable tablename =new JTable();
		TableColumn dateColumn = tablename.getColumnModel().getColumn(5);
		dateColumn.setCellEditor(new DatePickerCellEditor());
		
		f.setVisible(true);
		
		//윈도우 종료 버튼 이벤트
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
