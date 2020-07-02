package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Class 클래스
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//객체를 생성해서 클래스 이름 획득
		Person person=new Person();
		//Object를 상속받고있기때문에 그안에 클래스들을 사용할 수 있음
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		//클래스가 접근해서 클래스이름 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("pk23.Person"); //찾을 문자열이 틀렸을수도있기때문에 예외처리
		System.out.println(pClass3.getName());
		
		
		Constructor[] pCon=pClass3.getConstructors();
		for(Constructor i : pCon) {
			System.out.println(i);
		}
		System.out.println();
		Method[] pMet=pClass3.getMethods();
		for(Method i : pMet) {
			System.out.println(i);
		}
	}

}
