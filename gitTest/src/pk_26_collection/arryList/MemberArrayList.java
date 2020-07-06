//arryList
package pk_26_collection.arryList;
import java.util.ArrayList;
import java.util.Iterator;

import pk_26_collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList; //ArrayList 선언
	
	public MemberArrayList(){
		arrayList =new ArrayList<Member>(); //멤버로 선언한 ArrayList가 인스턴스화 됨
	}
	
	public void addMember(Member member) { //ArrayLsist에 멤버 추가
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { //받은 멤버 아이디와 같은게 있으면 지운다
		for(int i=0;i<arrayList.size();i++) {
			//get()메소드는순서 있는것만 쓸수있다
			Member member=arrayList.get(i);  //해당 아이디를 가진 멤버를 ArrayList에서 찾음
			int tempId=member.getMemberId();
			if(tempId==memberId) {			//멤버아이디가 매개변수와 일치하면
				arrayList.remove(i);		//해당멤버를 삭제
				return true;				//true반환
			}
		}
		
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
			//get()메소드가 없는(순서가없는) set구조는Iterator를 사용해 next로 다음순서를 불러온다
			Member member = ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {		//멤버아이디가 매개변수와 일치하면
				arrayList.remove(member); //해당 멤버를 삭제
				return true;
			}
		}
		
		
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}System.out.println();
		System.out.println(arrayList);
		
	}
	
}
