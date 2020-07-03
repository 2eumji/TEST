package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","신짱구");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		
		//p1.nation="usa"; nation은 final이라서 안바뀜
		//p1.ssn="21316546"; ssn은 final이라서 안바뀜
		p1.name="신짱아";
		System.out.println(p1.name);
	}

}
