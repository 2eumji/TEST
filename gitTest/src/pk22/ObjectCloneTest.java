package pk22;

//(��������)Ŭ���� ��ü�� ����
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle (10,20,30);
		//�ٿ�ĳ����
		Circle copycircle=(Circle)circle.clone();
		System.out.println(circle);
		System.out.println(copycircle);
		
		//�ؽð�...hash �ڵ� �Ǳ� �� ��
		System.out.println(System.identityHashCode(circle));	
		System.out.println(System.identityHashCode(copycircle));	
	}
}
