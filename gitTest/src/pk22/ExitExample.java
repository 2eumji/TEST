package pk22;

//Exit System.exit();
public class ExitExample {
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			System.out.print(i);
			if(i==5) {
				System.exit(i); // ���� ������Ʈ�� �ٷ� ����(���缭 ������ ��������)
				// break; for�� ���� �ϰ� ������ ����
			}
		}System.out.println("������Ʈ ����");
	}
}
