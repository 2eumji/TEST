package chapter26;

import java.util.Scanner;
import java.util.Vector;

// -1이 입력될때까지 List에 Vector에 자료(Integer) 저장하고 최대값을 출력하는 알고리즘  

public class VectorBig {
	
	public static void printBig(Vector<Integer> v) {
		int big=v.get(0); //비교대상이 없으므로 맨처음에 있는수로 초기화
		
		for(int i=0;i<v.size();i++) {
			if(big<v.get(i)) { //더 큰수를 찾기위해 비교
				big=v.get(i); //더 큰수를 big에 저장
			}
		}
		System.out.println("최대값: "+big);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		//Scanner 객체 생성
		Scanner sc=new Scanner(System.in);
		//입력
		System.out.println("정수를 입력하세요(-1이 입력되면 종료)");
		while(true) {
			int a=sc.nextInt();
			if(a==-1) {
				System.out.println("입력 종료");
				break;
			}
			v.add(a);
		}
		if(v.size()==0) {
			System.out.println("입력된 수가 없습니다");
			sc.close();
			return;
		}
		printBig(v); //가장 큰 수를 출력
		sc.close();
	}
}	
