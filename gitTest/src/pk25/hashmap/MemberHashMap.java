//Map 
package pk25.hashmap;
import java.util.HashMap;
import java.util.Iterator;

import pk_26_collection.Member;
public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	//construct
	public MemberHashMap() {
		hashMap=new HashMap<Integer,Member>();
	}
	//����߰�
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	//��� ����
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}else {
			System.out.println(memberId+"�� �������� �ʽ��ϴ�");
			return false;
		}
	}
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator(); //keySet():key�� �����ϰ��ִ� �޼ҵ�  
		while(ir.hasNext()) {
			int key=ir.next(); //Key�� ����
			Member member=hashMap.get(key); //Ű�����ͼ� ���� ���� �ڵ����� ��������
			System.out.println(member);
		}
		System.out.println();
	}
}
