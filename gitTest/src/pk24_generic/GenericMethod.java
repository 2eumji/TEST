package pk24_generic;

public class GenericMethod {
	
	
	public static <T,V> double makeRec(Point<T,V> p1, Point<T,V> p2) {
		
		double left=((Number)p1.getx()).doubleValue(); //왼쪽값 T에서 받음
		double right=((Number)p2.getx()).doubleValue(); //왼쪽값 T에서 받음
		double top=((Number)p1.gety()).doubleValue(); //왼쪽값 T에서 받음
		double bottom=((Number)p2.gety()).doubleValue(); //왼쪽값 T에서 받음
		
		double width=right-left; //가로사이즈
		double height=bottom-top; //세로사이즈
		
		return width*height;
	}
	
	
	public static void main(String[] args) {
		
		Point<Integer,Double> p1=new Point<Integer,Double>(0,0.0); //두가지 형태 다 가능
		Point<Integer,Double> p2=new Point<>(10,10.0); //두가지 형태 다 가능
		double rect=GenericMethod.<Integer,Double> makeRec(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+ rect + "입니다.");
		
	}

}
