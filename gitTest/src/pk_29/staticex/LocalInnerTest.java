//�����̳�Ŭ����
package pk_29.staticex;
class OuterClass{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	
	//�޼���
	Runnable getRunnable(int i) {
		int num=100; //��������
		//�޼��� ���ο� Ŭ���� ����
		class MyRunnable implements Runnable {
			int localnum=10;
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : "+ localnum+"������ �ν��Ͻ� ����");
				System.out.println("outNum : "+ outNum+"�ܺ�Ŭ������ �ν��Ͻ� ����");
				System.out.println("OutClass-static : "+ sNum+"�ܺ�Ŭ������ ��������");
			}
			
		}return new MyRunnable();
	}
}
public class LocalInnerTest {
	public static void main(String[] args) {
		
		OuterClass out= new OuterClass();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}
}
