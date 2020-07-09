package chapter26;

import java.util.Scanner;
import java.util.Vector;

// -1�� �Էµɶ����� List�� Vector�� �ڷ�(Integer) �����ϰ� �ִ밪�� ����ϴ� �˰���  

public class VectorBig {
	
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); //�񱳴���� �����Ƿ� ��ó���� �ִ¼��� �ʱ�ȭ
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) { //�� ū���� ã������ ��
				big=v.get(i); //�� ū���� big�� ����
			}
		}
		System.out.println("�ִ밪: "+big);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		//Scanner ��ü ����
		Scanner sc=new Scanner(System.in);
		//�Է�
		System.out.println("������ �Է��ϼ���(-1�� �ԷµǸ� ����)");
		while(true) {
			int a=sc.nextInt();
			if(a==-1) {
				System.out.println("�Է� ����");
				break;
			}
			v.add(a);
		}
		if(v.size()==0) {
			System.out.println("�Էµ� ���� �����ϴ�");
			sc.close();
			return;
		}
		printBig(v); //���� ū ���� ���
		sc.close();
	}
}	
