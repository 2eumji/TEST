package pk23;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//Class Ŭ����
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//��ü�� �����ؼ� Ŭ���� �̸� ȹ��
		Person person=new Person();
		//Object�� ��ӹް��ֱ⶧���� �׾ȿ� Ŭ�������� ����� �� ����
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		//Ŭ������ �����ؼ� Ŭ�����̸� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("pk23.Person"); //ã�� ���ڿ��� Ʋ���������ֱ⶧���� ����ó��
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
