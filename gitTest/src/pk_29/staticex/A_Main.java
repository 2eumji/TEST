package pk_29.staticex;

public class A_Main {
	public static void main(String[] args) {
		A a=new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b=a.new B();//a�� ��ü�� ���ͼ� ��������
		b.field1=3;
		b.method1();
		//����(static)��� Ŭ���� ��ü����
		A.C c=new A.C();//static(����������(data)�� �����ֱ⋚����  A��ü(heap)�� �����Ҽ��¾���
		c.field1=3;
		c.method1();
		c.field2=5;//static�� Ŭ���� ��ü�� �����⸦ ������
		c.method2();
		A.C.field2=3;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
