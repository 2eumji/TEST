package pk_29.staticex;

public class Student {
	//�ν��Ͻ� ����
	public static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() { //�¾������ �ø���ѹ��� �ϳ��� ����
		serialNum++;
		studentID=serialNum;
	}
	//static �޼ҵ�
	public String getStudentName() {
		return studentName;
	}
	public void setSutdentNum(String name) {
		studentName=name;
	}
	//stat��c �޼ҵ�
	public static int getSerialNum() {
		int i=10; //�������� (stack�޸�):�޼ҵ尡 ������ ������
		//studentName="aaa"; �ν��Ͻ�����(heap)�޸�
		serialNum++;//(Data)�޸�
		return serialNum;
	}
	public static void setSrialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
	
}
