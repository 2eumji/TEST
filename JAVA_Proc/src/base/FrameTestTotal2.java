//���տ��� final ���̾�α�â,�޼����ڽ�,���ϻ�����
package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTestTotal2 {
	public static void main(String[] args) {
		//������ �����
		Frame f=new Frame();
		f.setBounds(200, 100, 250, 400);
		f.setBackground(Color.lightGray);
		
		//��Ʈ
		Font font=new Font(Font.SANS_SERIF,Font.PLAIN,18);
		
		//���ʴ�: ������Ʈ�� �ϳ��� ���´�.
		Panel pNorth=new Panel(); //����
		pNorth.setBackground(Color.pink);
		
		//�Է¹޴� ����
		TextField tf=new TextField(10);
		Button btn=new Button("�Է�");
		btn.setEnabled(false);
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//�ؽ�Ʈ�ڽ�(�Է¹ޱ�)
		TextArea ta=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.orange);
		
		Button btnSave=new Button("����");
		Button btnClose=new Button("�ݱ�");
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		f.add(pNorth,BorderLayout.NORTH);
		f.add(ta,BorderLayout.CENTER);
		f.add(pSouth,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setResizable(false);
		
		//TextField�� ���� �� ��쿡 �Է� ��ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		
		//�߾ӿ� �ؽ�Ʈ���� ����(ENTER)
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//TextField(��ǲ�ؽ�Ʈ)�� �Է��� ���� TextArea�� �����߰�(Enter)
				if(e.getKeyChar()==KeyEvent.VK_ENTER) { //Ű���� ���Ϳ� ������
					ta.append(tf.getText()+"\n"); //ta�� �־�� tf�� �ؽ�Ʈ��
					
					tf.setText("");//�ؽ�Ʈ�ڽ� �ʱ�ȭ
					tf.requestFocus();//Ŀ�� tf�� ����
				}
			}
		});
		
		//�߾ӿ� �ؽ�Ʈ���� ����(�Է¹�ư Ŭ��)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n"); //ta�� �־�� tf�� �ؽ�Ʈ��
				
				tf.setText("");
				tf.requestFocus();//Ŀ�� tf�� ����
			}
		});
		//�ݱ��ưâ�ݱ�
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message=ta.getText();
				//������ ������ ���� ���� ������ ���� ó�� ����
				try {
					//FileDialog : save�� load�Ҷ� �ʿ��� ��ȭ����
					FileDialog fd=new FileDialog(f,"����",FileDialog.SAVE);//������̾�α�â �θ���
					fd.setVisible(true);//â�̱⶧���� ��� ���־����
					String path=fd.getDirectory()+fd.getFile();//������
					
					if(!message.equals("")) { //�޽����� ������������� ����
						//path��ο� �ؽ�Ʈ ���ϻ����ؼ� ����
						FileWriter fw=new FileWriter(path); //������ path��ο� ����
						BufferedWriter bw=new BufferedWriter(fw); //���Ͽ� �����Է�
						bw.write(message);
						
						if(fd.getFile() != null) { //������ �ߵ�����
							//�޼���â ����
							JOptionPane.showMessageDialog(f, path+"\n��ο� ����Ǿ����ϴ�.");
						}
						bw.close();
					}else{
							JOptionPane.showMessageDialog(f,"������ ������ �����ϴ�.");
							
					}
				}catch (IOException e2) { //��������� ����ó��
					e2.printStackTrace();
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null,"���α׷��� �����մϴ�");
				System.exit(0);
			}
		});
	}
}
