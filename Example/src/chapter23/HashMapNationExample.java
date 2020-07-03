package chapter23;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapNationExample {
	public static void main(String[] args) {
	 
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		//입력부
		while(true) { //그만이 입력될때까지 입력을 반복
			System.out.print("나라이름, 인구 >>");
			//scanner로 입력받은것을 변수방에 저장
			String nation=sc.next();
			//변수방에 그만이라는 문자가 들어오면 브레이크(equals)
			if(nation.equals("그만")) {
				break;
			}
			int popul=sc.nextInt();
			nations.put(nation,popul); //HashMap의 메소드 put으로 넣으면 저장이됨
		}
		
		//인구검색부
		while(true) {
			System.out.print("인구 검색할 나라명 >> ");
			String nation=sc.next();
			if(nation.equals("그만")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			//nation.get으로 인구 추출해서 변수방에 저장
			Integer value=nations.get(nation); //객체로 받아야 예외처리가 쉬움
			if(value==null) {
				System.out.println(nation+"나라가 없습니다");
			}else {
				System.out.println(nation+"의 인구는"+value);
			}
		}
		sc.close();
	}

}
