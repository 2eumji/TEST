package pk22;

//BoxingUnBoxingExample
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing :: �⺻Ÿ���� ���� ��üȭ
		Integer obj1= new Integer(100);
		Integer obj2= new Integer("200");
		//Integer obj3= Integer.valueOf("300");
		
		//unBoxing :: ��ü���� �⺻�ڷ������� ������ ����
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		System.out.println(value1);
		System.out.println(value2);
	}
}
