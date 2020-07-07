package pk25.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import pk_26_collection.Member;
public class MemberTreeMap {
	private TreeMap<Integer,Member> treeMap;
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer,Member>();
	}
	//멤버추가
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	//멤버삭제
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}else {
			System.out.println(memberId+"는 없는 ID입니다");
			return false;
		}
	}
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
	}

}
