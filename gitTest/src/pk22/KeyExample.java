package pk22;

//HashMap 
import java.util.HashMap;
public class KeyExample {
	public static void main(String[] args) {
		//형구분없이 2개의 매개변수를 받을것이다 Key값을 넣으면 String값을 저장하는 객체 생성
		HashMap<Key, String> hashmap=new HashMap<Key,String>(); //유연하게 제너릭으로 만들어줌
		
		//식별키 (Hashcode)에 put()으로 입력
		hashmap.put(new Key(1), "신짱구");
		
		//식별키 (Hashcode)를 get()이용하여 값(String)을 읽어옴
		String value=hashmap.get(new Key(1)); 
		System.out.println(value);
	}
}
