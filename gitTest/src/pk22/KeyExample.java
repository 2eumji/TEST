package pk22;

//HashMap 
import java.util.HashMap;
public class KeyExample {
	public static void main(String[] args) {
		//�����о��� 2���� �Ű������� �������̴� Key���� ������ String���� �����ϴ� ��ü ����
		HashMap<Key, String> hashmap=new HashMap<Key,String>(); //�����ϰ� ���ʸ����� �������
		
		//�ĺ�Ű (Hashcode)�� put()���� �Է�
		hashmap.put(new Key(1), "��¯��");
		
		//�ĺ�Ű (Hashcode)�� get()�̿��Ͽ� ��(String)�� �о��
		String value=hashmap.get(new Key(1)); 
		System.out.println(value);
	}
}
