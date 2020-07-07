package pk_26_collection.hashset;
import java.util.HashSet;
import java.util.Iterator;

import pk_26_collection.Member;

public class MemberHashSet {
	//HashSet 타입의 필드 생성(인스턴스변수(힙메모리)
	private HashSet<Member> hashSet;
	//생성자 overriding을 통해서 HashSetd의 객체를 hashSet에 모으기
	public MemberHashSet(){
		hashSet=new HashSet<Member>();//MemberHashSet의 객체가 생성됨가 동시에 hashSet으로 들어감
	}
	//hashSet에 객체 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	//hashSet에 객체 삭제 (Hashset에선 get이 없어서 Iterator를 통해서 비교판단해야함)
	public boolean removeMember(int memberId) {
		Iterator<Member> ir= hashSet.iterator();
		while(ir.hasNext()) { //hasNext :다음객체가 존재하는ㄷ지 판단하여 진행하는 메소드
			Member member=ir.next();
			int tempId= member.getMemberId();
			if(tempId==memberId) {
				hashSet.remove(member); //해당멤버를 삭제
				return true; 
			}
		}
		System.out.println(memberId+"아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}System.out.println(hashSet);
	}
}
