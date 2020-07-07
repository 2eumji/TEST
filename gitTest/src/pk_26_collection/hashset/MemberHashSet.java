package pk_26_collection.hashset;
import java.util.HashSet;
import java.util.Iterator;

import pk_26_collection.Member;

public class MemberHashSet {
	//HashSet Ÿ���� �ʵ� ����(�ν��Ͻ�����(���޸�)
	private HashSet<Member> hashSet;
	//������ overriding�� ���ؼ� HashSetd�� ��ü�� hashSet�� ������
	public MemberHashSet(){
		hashSet=new HashSet<Member>();//MemberHashSet�� ��ü�� �����ʰ� ���ÿ� hashSet���� ��
	}
	//hashSet�� ��ü �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//hashSet�� ��ü ���� (Hashset���� get�� ��� Iterator�� ���ؼ� ���Ǵ��ؾ���)
	public boolean removeMember(int memberId) {
		Iterator<Member> ir= hashSet.iterator();
		while(ir.hasNext()) { //hasNext :������ü�� �����ϴ¤��� �Ǵ��Ͽ� �����ϴ� �޼ҵ�
			Member member=ir.next();
			int tempId= member.getMemberId();
			if(tempId==memberId) {
				hashSet.remove(member); //�ش����� ����
				return true; 
			}
		}
		System.out.println(memberId+"���̵� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}System.out.println(hashSet);
	}
}
