package pk_29.staticex;

public class A_Main {
	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b=a.new B();//a의 객체로 들어와서 생성해줌
		b.field1=3;
		b.method1();
		//정적(static)멤버 클래스 객체생성
		A.C c=new A.C();//static(독립적으로(data)를 쓰고있기떄문에  A객체(heap)가 관여할수는없다
		c.field1=3;
		c.method1();
		c.field2=5;//static은 클래스 자체로 들어오기를 권장함
		c.method2();
		A.C.field2=3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
