package pk22;

public class EqualsTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"�̻��");
		Student studentLee2 =studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		//������ �ּ��� �ν��Ͻ� ��
		if(studentLee == studentLee2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		//�ٸ� �ּ��� �ν��Ͻ� ��
		if(studentLee == studentSang) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		//Object�ȿ��ִ� Ŭ�������� ���ٰ� ����(equals���� �����ǵǾ��)
		//����ڰ� ���� Ŭ�������� (equals �������������)
		if(studentLee.equals(studentLee)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		//�ν��Ͻ� ������ ��������� heap �޸� �ּ�
		System.out.println("studentLee�� hashcode �� : "+studentLee.hashCode()); //���� �ٸ� �ּҸ� ������ �Ȱ��� �������
		System.out.println("studentSang�� hashcode �� : "+studentSang.hashCode());//hashCode�� 10�����ι�ȯ����
		//�ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� ���� �ּ� �� : "+System.identityHashCode(studentLee)); //�����ּ�
		System.out.println("studentSang�� ���� �ּ� �� : "+System.identityHashCode(studentSang));
	}
	

}
