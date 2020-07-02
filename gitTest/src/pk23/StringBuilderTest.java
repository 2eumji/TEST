package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		//immutable �Һ�(����)
		String javaStr=new String("java");
		System.out.println("javaStr�� �޸� �ּ�: " + System.identityHashCode(javaStr));
		//String���κ��� �޾Ƽ� StringBuilder�� �籸���� Ȱ�밡���ϰ�...
		StringBuilder buffer=new StringBuilder(javaStr);
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� Buffer�� �޸� �ּ�: " + System.identityHashCode(buffer));
		buffer.append(" and "); //�����̱�
		buffer.append("android");
		buffer.append(" programming is fun!");
		System.out.println("���� �� Buffer�� �޸� �ּ�: " + System.identityHashCode(buffer));		
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		
		System.out.println("���� ������� javaStr�� �޸� �ּ�: " + System.identityHashCode(javaStr));
	}

}
