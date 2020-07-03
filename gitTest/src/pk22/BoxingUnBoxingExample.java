package pk22;

//BoxingUnBoxingExample
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing :: 기본타입의 값을 객체화
		Integer obj1= new Integer(100);
		Integer obj2= new Integer("200");
		//Integer obj3= Integer.valueOf("300");
		
		//unBoxing :: 객체값을 기본자료형으로 변수에 저장
		int value1=obj1.intValue();
		int value2=obj2.intValue();
		System.out.println(value1);
		System.out.println(value2);
	}
}
