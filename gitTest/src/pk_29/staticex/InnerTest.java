package pk_29.staticex;

class OutClass{
	//�ʵ�(�ν��Ͻ� ����=�������=�Ӽ�)
	private int num=10;
	private static int sNum=20;
	private InClass inClass;//���� Ŭ������ ����ó�� Ȱ���ϱ� ���� ��ü����;
	//construct�� ���ؼ� ���� Ŭ���� ��ü ����
	public OutClass() {
		System.out.println("OutClass�� �����Ǿ����ϴ�");
		inClass = new InClass();//���� Ŭ���� ����
	}
	
	class InClass{
		//���� Ŭ������ �ʵ�
		int inNum=100;
		/*�ܺο� �ν��Ͻ� ������ ����Ǿ� �ִ� static�� ������� ����ϴ°� ���������� 
		������ �ǰ� ������� ����ؾ��ϴ� staticŸ���� ������ �ٸ������� ������ �� �� ����*/
		//static int sNum=300;
		//static int sInNum=200;
		//static void sTest(){}
		//�޼���
		void inTest() {
			//num +=10;//�ܺ��� �ν��Ͻ�
			System.out.println("OutClass num= "+num+"(�ܺ�Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum= "+sNum+"(�ܺ�Ŭ������ static ����)");
			System.out.println("OutClass inNum= "+inNum+"(����Ŭ������ �ν��Ͻ� ����)");
		}
	}
	static class InStaticClass{ //heap���ִ°� ����
		int inNum=100;
		static int sInNum=200;
		void inTest() {
			//������ �ٸ����ε� num�� �ν��Ͻ�ȭ �����ʾƼ� ��������
			//num = 10; //�ܺ��� �ν��Ͻ�
			System.out.println("OutClass inNum= "+inNum+"(����Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sInNum= "+sInNum+"(����Ŭ������ ����ƽ ����)");
			System.out.println("OutClass sNum= "+sNum+"(�ܺ� Ŭ������ ����ƽ ����)"); //static�� static�� ��밡��
		}
		static void sTest() { //static �޼���
			//num+=10; heap�޸𸮴� ����
			//inNum=100;
			sNum=30;//static ����
			System.out.println(sNum);
			//System.out.println(sInNum); //������ Ŭ�������� static�ʵ�� ������
			System.out.println("OutClass sInNum= "+sInNum+"(����Ŭ������ ����ƽ ����)");
			System.out.println("OutClass sNum= "+sNum+"(�ܺ� Ŭ������ ����ƽ ����)"); 
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		
		OutClass o=new OutClass(); //�Ϲ�Ŭ����
		OutClass.InClass i=o.new InClass(); //�̳�Ŭ����
		OutClass.InStaticClass is=new OutClass.InStaticClass(); //�̳�staticŬ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ����Ŭ���� ����");
		i.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ���� ������ �Ϲݸ޼ҵ� ȣ��");
		is.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ���� ����ƽ �޼ҵ带 ȣ��");
		is.sTest();
		System.out.println("���� ���� Ŭ���� ����ƽ �޼ҵ带 ȣ��2");
		OutClass.InStaticClass.sTest();
	}

}
