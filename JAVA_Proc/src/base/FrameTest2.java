package base;

import javax.swing.JFrame;

public class FrameTest2 {
	public static void main(String[] args) {
		JFrame fr=new JFrame("�� ��°");
		fr.setSize(400, 400);//���� ���� ũ��
		fr.setLocation(100, 100); //��ǥ ��ġ
		//JFrameƯ¡
		//x��ư���� ������ �ݱ�(�������� ������ �޸𸮵� �Ҹ�)
		//�Ϲ� Frame���� ���±��
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
}
