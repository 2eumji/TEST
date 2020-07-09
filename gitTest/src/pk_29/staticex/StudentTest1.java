package pk_29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setSutdentNum("이지원");
		System.out.println(studentLee.serialNum);//초깃값 출력
		System.out.println("성명 : "+studentLee.studentName+" / 학번 : "+studentLee.studentID);
		
		//static의 set 메소드 또는 변경을 주면 안된다.
		//System.out.println(Student.setSrialNum(1005)); static이어서 안됨
		System.out.println(Student.getSerialNum());//객체아니고 클래스이름으로 들어가기를 권장(static)
		
		Student studentSon=new Student();
		studentSon.setSutdentNum("손수경");
		System.out.println(studentSon.serialNum);//초깃값 출력
		System.out.println("성명 : "+studentSon.studentName+" / 학번 : "+studentSon.studentID);
	}
}
