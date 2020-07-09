package pk_29.staticex;

class OutClass{
	//필드(인스턴스 변수=멤버변수=속성)
	private int num=10;
	private static int sNum=20;
	private InClass inClass;//내부 클래스를 변수처럼 활용하기 위해 객체선언;
	//construct를 통해서 내부 클래스 객체 생성
	public OutClass() {
		System.out.println("OutClass가 생성되었습니다");
		inClass = new InClass();//내부 클래스 생성
	}
	
	class InClass{
		//내부 클래스의 필드
		int inNum=100;
		/*외부에 인스턴스 변수로 선언되어 있는 static을 변경없이 사용하는건 가능하지만 
		기준이 되고 변경없이 사용해야하는 static타입의 변수를 다른곳에서 재정의 할 수 없다*/
		//static int sNum=300;
		//static int sInNum=200;
		//static void sTest(){}
		//메서드
		void inTest() {
			//num +=10;//외부의 인스턴스
			System.out.println("OutClass num= "+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum= "+sNum+"(외부클래스의 static 변수)");
			System.out.println("OutClass inNum= "+inNum+"(내부클래스의 인스턴스 변수)");
		}
	}
	static class InStaticClass{ //heap에있는건 못씀
		int inNum=100;
		static int sInNum=200;
		void inTest() {
			//영역이 다른곳인데 num이 인스턴스화 되지않아서 오류가뜸
			//num = 10; //외부의 인스턴스
			System.out.println("OutClass inNum= "+inNum+"(내부클래스의 인스턴스 변수)");
			System.out.println("OutClass sInNum= "+sInNum+"(내부클래스의 스태틱 변수)");
			System.out.println("OutClass sNum= "+sNum+"(외부 클래스의 스태틱 변수)"); //static에 static은 사용가능
		}
		static void sTest() { //static 메서드
			//num+=10; heap메모리는 못씀
			//inNum=100;
			sNum=30;//static 은됨
			System.out.println(sNum);
			//System.out.println(sInNum); //동급의 클래스안의 static필드는 사용못함
			System.out.println("OutClass sInNum= "+sInNum+"(내부클래스의 스태틱 변수)");
			System.out.println("OutClass sNum= "+sNum+"(외부 클래스의 스태틱 변수)"); 
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		
		OutClass o=new OutClass(); //일반클래스
		OutClass.InClass i=o.new InClass(); //이너클래스
		OutClass.InStaticClass is=new OutClass.InStaticClass(); //이너static클래스
		System.out.println("외부 클래스 변수를 이용하여 내부클래스 생성");
		i.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스 변수를 일반메소드 호출");
		is.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스 스태틱 메소드를 호출");
		is.sTest();
		System.out.println("정적 내부 클래스 스태틱 메소드를 호출2");
		OutClass.InStaticClass.sTest();
	}

}
