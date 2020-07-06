package pk_26_collection;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {} //디폴트 생성자
	
	public Member(int memberId,String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //객체여부확인
			Member compareid=(Member)obj; //다운캐스팅
			if(memberId==compareid.memberId) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return memberName+ "님의 아이디는 "+memberId+" 입니다.";
	}

	@Override
	public int compare(Member member1,Member member2) {
		return (member1.memberId - member2.memberId); //오름차순
	}
	
	
	
	
}
