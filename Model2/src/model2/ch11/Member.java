package model2.ch11;

public class Member {
	//ȸ�� ���� ��� ����
	private String name;
	private String email;
	
	public Member(String name,String email) {
		this.name=name;
		this.email=email;
	}
	
	//�⺻ �������� ��� ������ ���� �ű� ������ �ʱ�ȭ
	public Member() {
		name="ȫ�浿";
		email="hong@naver.com";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}