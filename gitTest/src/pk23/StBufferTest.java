package pk23;

class StBufferTest {
		
	public static void main(String[] args) {
		//String�� ���ڿ� ������ �ȵ�
		//����ؼ� �����ؼ� ����ؾ��Ҷ��� StringBuffer�� ���
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity()); //�뷮
		buf.ensureCapacity(100);//�뷮����
		System.out.println(buf.capacity());
		buf.insert(0, "HI!");
		buf.insert(11, "Everybody");
		System.out.println(buf);
		buf.delete(0, 3);
		System.out.println(buf);
	}	

}
