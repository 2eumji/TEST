package pk22;

public class Student {
	
	int studentId;
	String studentName;
	
	
	Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	//�������� ���� ����
	//Object ��ü�� ������ ����Ҽ��ִµ� Student�� ����ȯ���� ����Ҽ��ְ�����
	public boolean equals(Object obj) {
		//instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ� true,false������ ��ȯ
		if (obj instanceof Student){  //����ȯ�� �Ҽ��ִ���...
			//�ٿ�ĳ���� : �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� �� ��ȯ
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
