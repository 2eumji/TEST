package pk22;

public class StringEquals {
	
		public static void main(String[] args) {
			String str1 = new String ("abc");
			String str2 = new String ("abc");
			
			System.out.println(str1==str2); //�� String �ν��Ͻ� �ּҰ�(heap)�� �ٸ�
			//String Ŭ������ equals�޼ҵ尡 �������� �Ǿ� ������ ���� ������ ����
			System.out.println(str1.equals(str2));
			
			
			Integer i1=new Integer(100); //��Ҽ� :: �� �ٲ���̴�(������Ʈ����)
			Integer i2=new Integer(100);
			
			System.out.println(i1==i2);
			System.out.println(i1.equals(i2));
			
			
		}
}