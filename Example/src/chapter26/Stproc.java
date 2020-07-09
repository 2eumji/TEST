package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
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
public class Stproc {

	public static void main(String[] args) {

		Student student[] =new Student[4]; //Fixed-length
		ArrayList<Student> manage=new ArrayList<Student>();
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
			student[i]=new Student(name,depart,number,scoreAvg);
			//Array(Student)-->ArrayLIst�� ����
			manage.add(student[i]);
		}
		//=========================���============================	
		for(int i=0;i<manage.size();i++) {
			System.out.println("=================================");
			Student s=manage.get(i);
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
				for(int i=0;i<manage.size();i++) {
					//Student s=manage.get(i);
					manage.get(i).find_student(name);
				}
			}
		}
	}
}
		
		
