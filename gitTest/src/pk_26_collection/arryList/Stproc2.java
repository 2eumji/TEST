package pk_26_collection.arryList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
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
public class Stproc2 {

	public static void main(String[] args) {

		Student2 student[] =new Student2[4]; //Fixed-length
		HashMap<String,Student2> manage=new HashMap<String,Student2>();
		//=========================입력============================
		Scanner sc=new Scanner(System.in);
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요");
		for(int i=0;i<student.length;i++) {
			System.out.print(">>");
			String text=sc.nextLine();
			StringTokenizer st=new StringTokenizer(text,",");
			String name=st.nextToken().trim(); //trim() 공백을 삭제해줘야한다
			String depart=st.nextToken().trim();
			String number=st.nextToken().trim(); 
			Double scoreAvg=Double.parseDouble(st.nextToken().trim()); //4번째는 Double(클래스)로 바꿔줘야한다
			//fixed-length 받고
			student[i]=new Student2(name,depart,number,scoreAvg);
			//Array(Student)-->ArrayLIst에 넣음
			manage.put(name,student[i]); //add가없는관계로put으로
		}
		//=========================출력============================	
		Set<String> key=manage.keySet(); //키가 이름이라서 String
		//get이없기때문에 Iterator로...
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println("=================================");
			Student2 s=manage.get(name);
			System.out.println("이름 : "+s.getName());
			System.out.println("학과 : "+s.getDepart());
			System.out.println("학번 : "+s.getNumber());
			System.out.println("학점평균 : "+s.getScoreAvg());
		}
		
		System.out.println("=================================");
		while(true) {
			System.out.println("학생이름을 입력하세요");
			String name=sc.next();
			if(name.equals("그만")) {
				break;
			}else {
				Student2 s=manage.get(name);
				s.find_student(name);
			}
		}sc.close();
	}
}
		
		

