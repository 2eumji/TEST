package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass=Class.forName("java.lang.String"); //String Ŭ����
		Constructor [] cons=strClass.getConstructors(); //��� ������ �����ͼ� �迭������ (Object)
		
		System.out.println("String Ŭ������ ������");
		for(Constructor i : cons) {  //Constructor Ÿ����
			System.out.println(i);
		}
		System.out.println();
		System.out.println("String Ŭ������ �޼���");
		Method[] methods = strClass.getMethods();
		for(Method i : methods) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("String Ŭ������ �ʵ�");
		Field[] fields=strClass.getFields();
		for (Field i : fields) {
			System.out.println(i);
		}
	}
}
