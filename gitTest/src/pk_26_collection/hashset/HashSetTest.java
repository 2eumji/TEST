//HashSet
package pk_26_collection.hashset;
import java.util.HashSet;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		//중복 허용안함
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현경"));
		hashSet.add(new String("홍연희"));
		//hashSet.add(new String("강감찬"));
		//hashSet.add(new String("강감찬"));
		
		boolean b1=hashSet.add("강감찬");
		System.out.println(b1); //true
		
		boolean b2=hashSet.add("강감찬");
		System.out.println(b2); //false 중복되서 equals로 같은메모리사용(힙메모리 할당안됨)
		
		System.out.println(hashSet); //[박현경, 홍연희, 강감찬, 임정순] 결과는 4명
		
		
	}
}
