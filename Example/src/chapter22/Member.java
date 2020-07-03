package chapter22;

public class Member {
	String id;
	Member(String id){
		this.id=id;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(id.equals(member.id)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
