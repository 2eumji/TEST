package chapter23;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapNationExample {
	public static void main(String[] args) {
	 
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		//�Էº�
		while(true) { //�׸��� �Էµɶ����� �Է��� �ݺ�
			System.out.print("�����̸�, �α� >>");
			//scanner�� �Է¹������� �����濡 ����
			String nation=sc.next();
			//�����濡 �׸��̶�� ���ڰ� ������ �극��ũ(equals)
			if(nation.equals("�׸�")) {
				break;
			}
			int popul=sc.nextInt();
			nations.put(nation,popul); //HashMap�� �޼ҵ� put���� ������ �����̵�
		}
		
		//�α��˻���
		while(true) {
			System.out.print("�α� �˻��� ����� >> ");
			String nation=sc.next();
			if(nation.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			//nation.get���� �α� �����ؼ� �����濡 ����
			Integer value=nations.get(nation); //��ü�� �޾ƾ� ����ó���� ����
			if(value==null) {
				System.out.println(nation+"���� �����ϴ�");
			}else {
				System.out.println(nation+"�� �α���"+value);
			}
		}
		sc.close();
	}

}
