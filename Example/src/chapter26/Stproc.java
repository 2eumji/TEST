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
		Scanner sc=new Scanner(System.in);
		System.out.println("�л��̸�, �а�, �й�, ������� �Է��ϼ���");
		for(int i=0;i<student.length;i++) {
			System.out.println(">>");
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim(); //trim() ������ ����������Ѵ�
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim(); 
			Double scoreAvg=Double.parseDouble(st.nextToken().trim()); //4��°�� double�� �ٲ�����Ѵ�
			//fixed-length �ް�
			student[i]=new Student(name,depart,number,scoreAvg);
			//ArrayLIst�� ����
			manage.add(student[i]);
		}
		System.out.println();
		
		

	}

}
