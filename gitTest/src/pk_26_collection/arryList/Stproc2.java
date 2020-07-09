package pk_26_collection.arryList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/*
 * �ϳ��� �л� ������ ��Ÿ���� Student Ŭ�������� �̸�, �а�, �й�, ���� ����� �����ϴ� �ʵ尡 �ִ�.

(1) �л����� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ�, 

ArrayList<Student>�� ��� �л�(4��) ������ ����ϰ� �л� �̸��� �Է¹޾� �ش� �л��� ���� ����� ����ϴ� ���α׷��� �ۼ��϶�.
�л� �̸�, �а�, �й�, ������� �Է��ϼ���.
>> Ȳ����, �����, 1, 4.1
>> ���繮, �ȵ���̵�, 2, 3.9
>> �賲��, ������, 3, 3.5
>> ������, ������, 4, 4.25*/
public class Stproc2 {

	public static void main(String[] args) {

		Student2 student[] =new Student2[4]; //Fixed-length
		HashMap<String,Student2> manage=new HashMap<String,Student2>();
		//=========================�Է�============================
		Scanner sc=new Scanner(System.in);
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���");
		for(int i=0;i<student.length;i++) {
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim(); //trim() ������ ����������Ѵ�
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim(); 
			Double scoreAvg=Double.parseDouble(st.nextToken().trim()); //4��°�� Double(Ŭ����)�� �ٲ�����Ѵ�
			//fixed-length �ް�
			student[i]=new Student2(name,depart,number,scoreAvg);
			//Array(Student)-->ArrayLIst�� ����
			manage.put(name,student[i]); //add�����°����put����
		}
		//=========================���============================	
		Set<String> key=manage.keySet(); //Ű�� �̸��̶� String
		//get�̾��⶧���� Iterator��...
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println("=================================");
			Student2 s=manage.get(name);
			System.out.println("�̸� : "+s.getName());
			System.out.println("�а� : "+s.getDepart());
			System.out.println("�й� : "+s.getNumber());
			System.out.println("������� : "+s.getScoreAvg());
		}
		
		System.out.println("=================================");
		while(true) {
			System.out.println("�л��̸��� �Է��ϼ���");
			String name=sc.next();
			if(name.equals("�׸�")) {
				break;
			}else {
				Student2 s=manage.get(name);
				s.find_student(name);
			}
		}sc.close();
	}
}
		
		

