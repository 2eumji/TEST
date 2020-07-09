//로컬이너클래스
package pk_29.staticex;
class OuterClass{
	//필드
	int outNum=100;
	static int sNum=200;
	
	//메서드
	Runnable getRunnable(int i) {
		int num=100; //지역변수
		//메서드 내부에 클래스 생성
		class MyRunnable implements Runnable {
			int localnum=10;
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : "+ localnum+"내부의 인스턴스 변수");
				System.out.println("outNum : "+ outNum+"외부클래스의 인스턴스 변수");
				System.out.println("OutClass-static : "+ sNum+"외부클래스의 정적변수");
			}
			
		}return new MyRunnable();
	}
}
public class LocalInnerTest {
	public static void main(String[] args) {
		
		OuterClass out= new OuterClass();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}
}
