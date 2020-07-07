package pk_26_collection.hashset;
import pk_26_collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet=new MemberHashSet();
		Member memberLee=new Member(1001,"������");
		Member memberSon=new Member(1002,"�չα�");
		Member memberPark=new Member(1003,"�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember(); //���� ��� (��������)
		
		System.out.println();
		//��ü �߰�(�ߺ����̵�)�������� MemberŬ������ hash�ڵ�� equals �����ǰ� �ȵ��־ �ߺ��̵�
		//MemberŬ�������� �������̵� ����� �ߺ��� �ȵ� ������� �ϰ������ comparable �������̵��ؾ���
		Member memberHong=new Member(1003,"ȫ�浿");//1003���̵� �ߺ�
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}
}
