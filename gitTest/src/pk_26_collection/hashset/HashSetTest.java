//HashSet
package pk_26_collection.hashset;
import java.util.HashSet;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		//�ߺ� ������
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		//hashSet.add(new String("������"));
		//hashSet.add(new String("������"));
		
		boolean b1=hashSet.add("������");
		System.out.println(b1); //true
		
		boolean b2=hashSet.add("������");
		System.out.println(b2); //false �ߺ��Ǽ� equals�� �����޸𸮻��(���޸� �Ҵ�ȵ�)
		
		System.out.println(hashSet); //[������, ȫ����, ������, ������] ����� 4��
		
		
	}
}
