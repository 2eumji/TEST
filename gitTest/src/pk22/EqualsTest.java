package pk22;

public class EqualsTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(100,"이상원");
		Student studentLee2 =studentLee;
		Student studentSang = new Student(100,"이상원");
		
		//동일한 주소의 인스턴스 비교
		if(studentLee == studentLee2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//다른 주소의 인스턴스 비교
		if(studentLee == studentSang) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//Object안에있는 클래스들은 같다고 나옴(equals에서 재정의되어나옴)
		//사용자가 만든 클래스들은 (equals 재정의해줘야함)
		if(studentLee.equals(studentLee)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//인스턴스 생성시 만들어지는 heap 메모리 주소
		System.out.println("studentLee의 hashcode 값 : "+studentLee.hashCode()); //원래 다른 주소를 억지로 똑같이 만들어줌
		System.out.println("studentSang의 hashcode 값 : "+studentSang.hashCode());//hashCode는 10진수로반환해줌
		//인스턴스 전에 주어지는 실제 주소
		System.out.println("studentLee의 실제 주소 값 : "+System.identityHashCode(studentLee)); //원래주소
		System.out.println("studentSang의 살제 주소 값 : "+System.identityHashCode(studentSang));
	}
	

}
