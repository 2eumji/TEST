package pk_29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentLee=new Student();
		studentLee.setSutdentNum("������");
		System.out.println(studentLee.serialNum);//�ʱ갪 ���
		System.out.println("���� : "+studentLee.studentName+" / �й� : "+studentLee.studentID);
		
		//static�� set �޼ҵ� �Ǵ� ������ �ָ� �ȵȴ�.
		//System.out.println(Student.setSrialNum(1005)); static�̾ �ȵ�
		System.out.println(Student.getSerialNum());//��ü�ƴϰ� Ŭ�����̸����� ���⸦ ����(static)
		
		Student studentSon=new Student();
		studentSon.setSutdentNum("�ռ���");
		System.out.println(studentSon.serialNum);//�ʱ갪 ���
		System.out.println("���� : "+studentSon.studentName+" / �й� : "+studentSon.studentID);
	}
}
