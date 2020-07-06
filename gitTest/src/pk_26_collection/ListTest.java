package pk_26_collection;

import java.util.ArrayList;
import java.util.List;

//컬렉션 (인터페이스) 
//ArrayList List

public class ListTest {
	public static void main(String[] args) {
		
		//List 구조를 갖는 ArrayList클래스의 객체생성
		List<String> ls=new ArrayList<String>();
		//리스트에 데이터 추가
		ls.add("Hi");
		ls.add("Have");
		ls.add("a Nice Day");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i +":"+ls.get(i).toString());
		}System.out.println();
		
		//자유롭게 추가
		ls.add(3,"Everybody");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i +":"+ls.get(i).toString());
		}System.out.println();
		
		//삭제 (인덱스 없애면 자동으로 숫자떙김)
		ls.remove(0);
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i +":"+ls.get(i).toString());
		}System.out.println();
		
	}
}
