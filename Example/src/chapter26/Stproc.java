package chapter26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.

(1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에, 

ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
학생 이름, 학과, 학번, 학점평균 입력하세요.
>> 황기태, 모바일, 1, 4.1
>> 이재문, 안드로이드, 2, 3.9
>> 김남윤, 웹공학, 3, 3.5
>> 최찬미, 빅데이터, 4, 4.25*/
public class Stproc {

	public static void main(String[] args) {

		Student student[] =new Student[4]; //Fixed-length
		ArrayList<Student> manage=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<student.length;i++) {
			System.out.println(">>");
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim(); //trim() 공백을 삭제해줘야한다
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim(); 
			Double scoreAvg=Double.parseDouble(st.nextToken().trim()); //4번째는 double로 바꿔줘야한다
			//fixed-length 받고
			student[i]=new Student(name,depart,number,scoreAvg);
			//ArrayLIst에 넣음
			manage.add(student[i]);
		}
		System.out.println();
		
		

	}

}
