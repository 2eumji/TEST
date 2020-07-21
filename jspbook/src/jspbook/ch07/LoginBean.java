//자바빈
package jspbook.ch07;
public class LoginBean{
	//사용자로부터 입력받은 아이디와 비번
	private String userid;
	private String password;
	
	//DB로 부터 가져온 아이디와 비번
	
	final String _userid="myuser";
	final String _password="1234";
	
	//로그인 계정 정보가 DB와 일치하는지 여부판단
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
