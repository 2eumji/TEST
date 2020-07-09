package pk_29.staticex;

public class Student {
	//인스턴스 변수
	public static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() { //태어날때마다 시리얼넘버가 하나씩 증가
		serialNum++;
		studentID=serialNum;
	}
	//static 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setSutdentNum(String name) {
		studentName=name;
	}
	//statㅑc 메소드
	public static int getSerialNum() {
		int i=10; //지역변수 (stack메모리):메소드가 끝나면 없어짐
		//studentName="aaa"; 인스턴스변수(heap)메모리
		serialNum++;//(Data)메모리
		return serialNum;
	}
	public static void setSrialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
	
}
