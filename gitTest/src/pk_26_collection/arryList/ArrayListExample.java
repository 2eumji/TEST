package pk_26_collection.arryList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add("DATABASE");
		list.add("Spring");
		
		//�� ��ü ��
		System.out.println("�� ��ü �� : "+list.size());
		//for-> size, get,
		for(int i=0;i<list.size();i++) {
		 String str=list.get(i); //String���� �޾ƿ����ϱ� String���� ����
		 System.out.println(i +": "+ str);
		}
		//����
		list.remove("Java");
		list.remove(2);
		list.remove(2);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			 String str=list.get(i);
			 System.out.println(i +": "+ str);
			}
		
	}
}
