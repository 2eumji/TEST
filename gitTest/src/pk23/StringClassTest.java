package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass=Class.forName("java.lang.String"); //String 클래스
		Constructor [] cons=strClass.getConstructors(); //모든 생성자 가져와서 배열로저장 (Object)
		
		System.out.println("String 클래스의 생성자");
		for(Constructor i : cons) {  //Constructor 타입임
			System.out.println(i);
		}
		System.out.println();
		System.out.println("String 클래스의 메서드");
		Method[] methods = strClass.getMethods();
		for(Method i : methods) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("String 클래스의 필드");
		Field[] fields=strClass.getFields();
		for (Field i : fields) {
			System.out.println(i);
		}
	}
}
