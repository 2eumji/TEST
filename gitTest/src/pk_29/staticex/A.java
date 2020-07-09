//이너클래스(inner class)

//A클래스안에 B클래스가 있기떄문에 B클래스안에 단독으로 static필드나 메소드를 사용할수 없다
//(굳이 주고싶으면 B클래스를 static을준다)

package pk_29.staticex;
public class A { //-->static아니기떄문에 heap을 쓰고있음
	//생성자
	A(){
		System.out.println("A객체가 생성됨");
	}
	//inner class중에서 인스턴스 멤버 클래스는 static선언안됨
	//인스턴스 멤버 클래스 (클래스를 변수처럼 사용)
	public class B{
		//필드
		int field1;
		//private static int field2;  ==>안됨
		//생성자
		B(){
			System.out.println("B객체가 생성됨");
		}
		//메소드
		void method1() {}
		//static void method2() {}  ==>안됨
	}
	//inner class중에서 정적(static : data메모리 사용) 멤버 클래스
	static class C{ //static을 붙여줬기떄문에 태어나자마자 독립적으로 사용가능 (A클래스와는 상관없음(자식일뿐)
		int field3; 
		int field1; // B에있는 필드 =>사용가능
		static int field2; //-->static 가능
		
		C(){
			System.out.println("C객체가 생성됨");
		}
		void method1(){}
		static void method2() {}
	}
	void method() { //A의 일반 메소드
		//inner class 중에서 로컬 클래스 (메소드 안에 클래스)
		class D{
			int field1;
			D(){
				System.out.println("D객체가 생성됨");
			}
			void method5() {}
			//static void method2() {} static 필드,메소드 안됨 
		}
		//D가 참조클래스 아래가 메인의 역할
		D d=new D();
		d.field1=3;
		d.method5();
	}
}
