package pk30.reduce;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer customerLee=new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim=new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong=new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> customerList=new ArrayList<>(); //List�Ʒ����ִ� ArrayList���
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		
		System.out.println("\n==�� ��� �߰��� ������� ���==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("\n==�� ���� ��� ���==");
		
		int total=customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(total);
		
		System.out.println("\n==20�� �̻� ����� �����Ͽ� ���==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
	}
}
