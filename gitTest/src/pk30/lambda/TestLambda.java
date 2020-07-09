package pk30.lambda;
//선언부
interface PrintString{
	void showString(String str);
}
public class TestLambda {
	public static void main(String[] args) {
		//람다식을 변수에 대입(유형1)
		PrintString ps1=(s)->System.out.println(s);
		ps1.showString("Hello lambda_1");
		
		//함수형 람다 유형1
		showMyString(ps1); //ps1: 람다식 객체
		//(s)->System.out.println(s); 복사되어 ps1에 담겨있음
		
		//함수형 람다 유형2
		PrintString reStr=returnString();
		reStr.showString("hello");
		
	}
	public static void showMyString(PrintString p) {
		p.showString("Hello lambda_2");
	}
	
	public static PrintString returnString() {
		return (s)->System.out.println(s+"World");
	}
}
