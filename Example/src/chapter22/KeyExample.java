package chapter22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//HashMap 클래스는  Key값을 주면 value값을 반환해주는메소드
		HashMap<Key, String> hashmap=new HashMap<Key, String>();
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashmap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 가져옴
		String value=hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
