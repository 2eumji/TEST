package pk6;

public class PersonExample {

	public static void main(String[] args) {
		Person p1=new Person("123456-1234567","��¯��");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		
		//p1.nation="usa"; nation�� final�̶� �ȹٲ�
		//p1.ssn="21316546"; ssn�� final�̶� �ȹٲ�
		p1.name="��¯��";
		System.out.println(p1.name);
	}

}
