package pk_26_collection.treeset;

import pk_26_collection.Member;
public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		Member memberLee=new Member(1005,"이지원");
		Member memberSon=new Member(1002,"손민국");
		Member memberPark=new Member(1003,"박서훤");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember(); //랜덤 출력 (순서없음)
		
		System.out.println();
		//객체 추가(중복아이디)직접만든 Member클래스는 hash코드랑 equals 재정의가 안되있어서 중복이됨
		//Member클래스에서 오버라이딩 해줘야 중복이 안됨 순서대로 하고싶으면 comparable 오버라이딩해야함
		Member memberHong=new Member(1003,"홍길동");//1003아이디 중복
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
		
		

	}

}
