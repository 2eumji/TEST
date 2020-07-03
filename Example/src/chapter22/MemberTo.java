package chapter22;

public class MemberTo {
	private String id;
	private String name;
	
	public MemberTo(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "아이디는 "+id+"이고 이름은"+name+"이다";
	}
	
}
