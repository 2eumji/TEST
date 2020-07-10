//종합예제 final 다이얼로그창,메세지박스,파일생성등
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
		//프레임 만들기
		Frame f=new Frame();
		f.setBounds(200, 100, 250, 400);
		f.setBackground(Color.lightGray);
		
		//폰트
		Font font=new Font(Font.SANS_SERIF,Font.PLAIN,18);
		
		//북쪽단: 컴포넌트를 하나로 붂는다.
		Panel pNorth=new Panel(); //내용
		pNorth.setBackground(Color.pink);
		
		//입력받는 상자
		TextField tf=new TextField(10);
		Button btn=new Button("입력");
		btn.setEnabled(false);
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		//텍스트박스(입력받기)
		TextArea ta=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.orange);
		
		Button btnSave=new Button("저장");
		Button btnClose=new Button("닫기");
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		f.add(pNorth,BorderLayout.NORTH);
		f.add(ta,BorderLayout.CENTER);
		f.add(pSouth,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setResizable(false);
		
		//TextField에 값이 들어간 경우에 입력 버튼 활성화
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
		
		//중앙에 텍스트값을 전달(ENTER)
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//TextField(인풋텍스트)에 입력한 값을 TextArea에 내용추가(Enter)
				if(e.getKeyChar()==KeyEvent.VK_ENTER) { //키값이 엔터와 같으면
					ta.append(tf.getText()+"\n"); //ta에 넣어라 tf의 텍스트를
					
					tf.setText("");//텍스트박스 초기화
					tf.requestFocus();//커서 tf에 놓기
				}
			}
		});
		
		//중앙에 텍스트값을 전달(입력버튼 클릭)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n"); //ta에 넣어라 tf의 텍스트를
				
				tf.setText("");
				tf.requestFocus();//커서 tf에 놓기
			}
		});
		//닫기버튼창닫기
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
				//저장할 내용이 없을 수도 있으니 에외 처리 해줌
				try {
					//FileDialog : save와 load할때 필요한 대화상자
					FileDialog fd=new FileDialog(f,"저장",FileDialog.SAVE);//저장다이얼로그창 부르기
					fd.setVisible(true);//창이기때문에 계쏙 떠있어야함
					String path=fd.getDirectory()+fd.getFile();//저장경로
					
					if(!message.equals("")) { //메시지가 비어있지않으면 저장
						//path경로에 텍스트 파일생성해서 저장
						FileWriter fw=new FileWriter(path); //파일을 path경로에 생성
						BufferedWriter bw=new BufferedWriter(fw); //파일에 내용입력
						bw.write(message);
						
						if(fd.getFile() != null) { //저장이 잘됐을때
							//메세지창 띄우기
							JOptionPane.showMessageDialog(f, path+"\n경로에 저장되었습니다.");
						}
						bw.close();
					}else{
							JOptionPane.showMessageDialog(f,"저장할 내용이 없습니다.");
							
					}
				}catch (IOException e2) { //비어있을때 예외처리
					e2.printStackTrace();
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null,"프로그램을 종료합니다");
				System.exit(0);
			}
		});
	}
}
