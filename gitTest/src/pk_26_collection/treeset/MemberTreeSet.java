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
	//Ʈ�������� ��� �߰�
	public void addMember(Member member) {
		treeSet.add(member);
	}
	//Ʈ�������� ��� ���� (���ؾ� �ϴϱ� boolean���� ��ȯ)
	public boolean removeMember(int memberId) {
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				return true;
			}
		}System.out.println(memberId+"���̵� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println(treeSet);
	}
}
