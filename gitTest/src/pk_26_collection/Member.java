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
	
	//Member Ŭ������ compare �Ǿ����� �����Ƿ� �������̵� ���ش�
	public int compareTo(Member member) {
		return (this.memberId - member.memberId); //��������
		//return (this.memberId - member.memberId)* -1;//��������
		//return (this.memberName.compareTo(member.memberName)); //��������(����)
		//return (this.memberName.compareTo(member.memberName))* (-1); //��������(����)
		//*���������� ����� ��ȯ(�⺻) ���������� ������ ��ȯ  
	}




	

}
