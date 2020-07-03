package pk22;

public class Student {
	
	int studentId;
	String studentName;
	
	
	Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	//논리적으로 같게 만듬
	//Object 객체만 이퀄스 사용할수있는데 Student도 형변환으로 사용할수있게해줌
	public boolean equals(Object obj) {
		//instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단 true,false값으로 반환
		if (obj instanceof Student){  //형변환을 할수있는지...
			//다운캐스팅 : 부모클래스 객체가 자식클래스 객체로 형 변환
			Student std=(Student)obj;
			if(studentId==std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}

	
	
	
}
