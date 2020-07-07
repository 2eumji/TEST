package pk_26_collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import pk_26_collection.Member;

public class MemberTreeSet{
	private TreeSet<Member> treeSet;
	public MemberTreeSet() {
		treeSet=new TreeSet<Member>();
	}
	public MemberTreeSet(TreesetCompare treesetCompare) {
		// TODO Auto-generated constructor stub
	}
	//트리셋으로 멤버 추가
	public void addMember(Member member) {
		treeSet.add(member);
	}
	//트리셋으로 멤버 삭제 (비교해야 하니까 boolean으로 반환)
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				return true;
			}
		}System.out.println(memberId+"아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println(treeSet);
	}
}
