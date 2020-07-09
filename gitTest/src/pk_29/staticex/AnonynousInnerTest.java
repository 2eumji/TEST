package pk_29.staticex;

class Outer2{
	//필드
	int outNum=100;
	static int sNum=200;
	
	//메서드 내부에 클래스 생성
	Runnable getRunnable(int i) {
		int num=100; //지역변수
		int localnum=10;
		return new Runnable() {
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : "+ localnum+"내부의 인스턴스 변수");
				System.out.println("outNum : "+ outNum+"외부클래스의 인스턴스 변수");
				System.out.println("OutClass-static : "+ sNum+"외부클래스의 정적변수");				
			}
		};
		//내부에서 작동중인객체
//		Runnable runner=new new Runnable() {
//			public void run() {
//			}
//		}
		 //클래스 이름 어차피 쓰지않기떄문에 위에처럼 이름없는 클래스를 만든다
		/*class MyRunnable implements Runnable { //함수안에 클래스를 만드려면  Runnable사용
			int localnum=10;
			
			@Override
			public void run() {
				//num=200;
				//i=20;
				System.out.println("localNum : "+ localnum+"내부의 인스턴스 변수");
				System.out.println("outNum : "+ outNum+"외부클래스의 인스턴스 변수");
				System.out.println("OutClass-static : "+ sNum+"외부클래스의 정적변수");
			}
		}return new MyRunnable();*/
		
	}
		
}

public class AnonynousInnerTest {
	public static void main(String[] args) {

		Outer2 out= new Outer2();
		Runnable runner=out.getRunnable(10);
		runner.run();
	}
}
