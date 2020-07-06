//arryList
package pk_26_collection.arryList;
import java.util.ArrayList;
import java.util.Iterator;

import pk_26_collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList(){
		arrayList =new ArrayList<Member>(); //����� ������ ArrayList�� �ν��Ͻ�ȭ ��
	}
	
	public void addMember(Member member) { //ArrayLsist�� ��� �߰�
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { //���� ��� ���̵�� ������ ������ �����
		for(int i=0;i<arrayList.size();i++) {
			//get()�޼ҵ�¼��� �ִ°͸� �����ִ�
			Member member=arrayList.get(i);  //�ش� ���̵� ���� ����� ArrayList���� ã��
			int tempId=member.getMemberId();
			if(tempId==memberId) {			//������̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);		//�ش����� ����
				return true;				//true��ȯ
			}
		}
		
		Iterator<Member> ir=arrayList.iterator();
		while(ir.hasNext()) {
			//get()�޼ҵ尡 ����(����������) set������Iterator�� ����� next�� ���������� �ҷ��´�
			Member member = ir.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {		//������̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member); //�ش� ����� ����
				return true;
			}
		}
		
		
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}System.out.println();
		System.out.println(arrayList);
		
	}
	
}
