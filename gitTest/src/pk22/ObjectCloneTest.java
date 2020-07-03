package pk22;

//(내가만든)클래스 객체를 복사
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle (10,20,30);
		//다운캐스팅
		Circle copycircle=(Circle)circle.clone();
		System.out.println(circle);
		System.out.println(copycircle);
		
		//해시값...hash 코드 되기 전 값
		System.out.println(System.identityHashCode(circle));	
		System.out.println(System.identityHashCode(copycircle));	
	}
}
