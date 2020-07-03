package pk24_generic;

public class GenericMethod {
	
	
	public static <T,V> double makeRec(Point<T,V> p1, Point<T,V> p2) {
		
		double left=((Number)p1.getx()).doubleValue(); //���ʰ� T���� ����
		double right=((Number)p2.getx()).doubleValue(); //���ʰ� T���� ����
		double top=((Number)p1.gety()).doubleValue(); //���ʰ� T���� ����
		double bottom=((Number)p2.gety()).doubleValue(); //���ʰ� T���� ����
		
		double width=right-left; //���λ�����
		double height=bottom-top; //���λ�����
		
		return width*height;
	}
	
	
	public static void main(String[] args) {
		
		Point<Integer,Double> p1=new Point<Integer,Double>(0,0.0); //�ΰ��� ���� �� ����
		Point<Integer,Double> p2=new Point<>(10,10.0); //�ΰ��� ���� �� ����
		double rect=GenericMethod.<Integer,Double> makeRec(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� "+ rect + "�Դϴ�.");
		
	}

}
