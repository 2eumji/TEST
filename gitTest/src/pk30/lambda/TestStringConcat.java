package pk30.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hi";
		
		//객체지향 방식
		StringConcatImpl sc1=new StringConcatImpl();
		sc1.makeString(s1, s2);
		
		//람다식(구현부 생략)
		StringConcat sc2=(s,v)->System.out.println(s+" "+v);
		sc2.makeString(s1, s2);
		
		
		//익명의 클래스
		StringConcat sc3=new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println("익명의 클래스 : "+s1+s2);
			}
		};
		sc3.makeString(s1, s2);
		
	}
}
