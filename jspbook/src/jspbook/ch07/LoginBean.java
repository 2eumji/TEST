//�ڹٺ�
package jspbook.ch07;
public class LoginBean{
	//����ڷκ��� �Է¹��� ���̵�� ���
	private String userid;
	private String password;
	
	//DB�� ���� ������ ���̵�� ���
	
	final String _userid="myuser";
	final String _password="1234";
	
	//�α��� ���� ������ DB�� ��ġ�ϴ��� �����Ǵ�
	public boolean checkUser() {
		if(userid.equals(_userid) && password.equals(_password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
