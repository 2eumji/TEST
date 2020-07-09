package pk30.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hi";
		
		//��ü���� ���
		StringConcatImpl sc1=new StringConcatImpl();
		sc1.makeString(s1, s2);
		
		//���ٽ�(������ ����)
		StringConcat sc2=(s,v)->System.out.println(s+" "+v);
		sc2.makeString(s1, s2);
		
		
		//�͸��� Ŭ����
		StringConcat sc3=new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("�͸��� Ŭ���� : "+s1+s2);
			}
		};
		sc3.makeString(s1, s2);
		
	}
}
