package pk_26_collection.treeset;

import pk_26_collection.Member;
public class MemberTreeSetTest {
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet=new MemberTreeSet();
		Member memberLee=new Member(1005,"������");
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1003,"�ڼ���");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember(); //���� ��� (��������)
		
		System.out.println();
		//��ü �߰�(�ߺ����̵�)�������� MemberŬ������ hash�ڵ�� equals �����ǰ� �ȵ��־ �ߺ��̵�
		//MemberŬ�������� �������̵� ����� �ߺ��� �ȵ� ������� �ϰ������ comparable �������̵��ؾ���
		Member memberHong=new Member(1003,"ȫ�浿");//1003���̵� �ߺ�
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
		
		
		

	}

}
