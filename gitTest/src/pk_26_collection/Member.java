package pk_26_collection;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {} //����Ʈ ������
	
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
		if(obj instanceof Member) { //��ü����Ȯ��
			Member compareid=(Member)obj; //�ٿ�ĳ����
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
		return memberName+ "���� ���̵�� "+memberId+" �Դϴ�.";
	}

	@Override
	public int compare(Member member1,Member member2) {
		return (member1.memberId - member2.memberId); //��������
	}
	
	
	
	
}
