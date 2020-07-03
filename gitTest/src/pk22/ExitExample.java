package pk22;

//Exit System.exit();
public class ExitExample {
	public static void main(String[] args) {
		
		for(int i=0; i<10;i++) {
			System.out.print(i);
			if(i==5) {
				System.exit(i); // 지금 프로젝트를 바로 종료(멈춰서 다음꺼 읽지않음)
				// break; for문 종료 하고 다음거 읽음
			}
		}System.out.println("프로젝트 종료");
	}
}
