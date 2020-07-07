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
	//멤버추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	//멤버 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}else {
			System.out.println(memberId+"가 존재하지 않습니다");
			return false;
		}
	}
	public void showAllMember() {
		Iterator<Integer> ir=hashMap.keySet().iterator(); //keySet():key값 저장하고있는 메소드  
		while(ir.hasNext()) {
			int key=ir.next(); //Key들 저장
			Member member=hashMap.get(key); //키꺼내와서 저장 값이 자동으로 가져와짐
			System.out.println(member);
		}
		System.out.println();
	}
}
