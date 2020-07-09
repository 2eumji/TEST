package pk30.lambda;
//�����
interface PrintString{
	void showString(String str);
}
public class TestLambda {
	public static void main(String[] args) {
		//���ٽ��� ������ ����(����1)
		PrintString ps1=(s)->System.out.println(s);
		ps1.showString("Hello lambda_1");
		
		//�Լ��� ���� ����1
		showMyString(ps1); //ps1: ���ٽ� ��ü
		//(s)->System.out.println(s); ����Ǿ� ps1�� �������
		
		//�Լ��� ���� ����2
		PrintString reStr=returnString();
		reStr.showString("hello");
		
	}
	public static void showMyString(PrintString p) {
		p.showString("Hello lambda_2");
	}
	
	public static PrintString returnString() {
		return (s)->System.out.println(s+"World");
	}
}
