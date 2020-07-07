package pk_26_collection;

public class Member implements Comparable<Member>{
	
	private int memberId;
	private String memberName;
	
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
	
	//Member 클래스는 compare 되어있지 않으므로 오버라이딩 해준다
	public int compareTo(Member member) {
		return (this.memberId - member.memberId); //오름차순
		//return (this.memberId - member.memberId)* -1;//내림차순
		//return (this.memberName.compareTo(member.memberName)); //오름차순(문자)
		//return (this.memberName.compareTo(member.memberName))* (-1); //내림차순(문자)
		//*오름차순은 양수로 반환(기본) 내림차순은 음수로 반환  
	}




	

}
