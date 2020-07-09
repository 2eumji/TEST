//�̳�Ŭ����(inner class)

//AŬ�����ȿ� BŬ������ �ֱ⋚���� BŬ�����ȿ� �ܵ����� static�ʵ峪 �޼ҵ带 ����Ҽ� ����
//(���� �ְ������ BŬ������ static���ش�)

package pk_29.staticex;
public class A { //-->static�ƴϱ⋚���� heap�� ��������
	//������
	A(){
		System.out.println("A��ü�� ������");
	}
	//inner class�߿��� �ν��Ͻ� ��� Ŭ������ static����ȵ�
	//�ν��Ͻ� ��� Ŭ���� (Ŭ������ ����ó�� ���)
	public class B{
		//�ʵ�
		int field1;
		//private static int field2;  ==>�ȵ�
		//������
		B(){
			System.out.println("B��ü�� ������");
		}
		//�޼ҵ�
		void method1() {}
		//static void method2() {}  ==>�ȵ�
	}
	//inner class�߿��� ����(static : data�޸� ���) ��� Ŭ����
	static class C{ //static�� �ٿ���⋚���� �¾�ڸ��� ���������� ��밡�� (AŬ�����ʹ� �������(�ڽ��ϻ�)
		int field3; 
		int field1; // B���ִ� �ʵ� =>��밡��
		static int field2; //-->static ����
		
		C(){
			System.out.println("C��ü�� ������");
		}
		void method1(){}
		static void method2() {}
	}
	void method() { //A�� �Ϲ� �޼ҵ�
		//inner class �߿��� ���� Ŭ���� (�޼ҵ� �ȿ� Ŭ����)
		class D{
			int field1;
			D(){
				System.out.println("D��ü�� ������");
			}
			void method5() {}
			//static void method2() {} static �ʵ�,�޼ҵ� �ȵ� 
		}
		//D�� ����Ŭ���� �Ʒ��� ������ ����
		D d=new D();
		d.field1=3;
		d.method5();
	}
}
