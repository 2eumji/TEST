package pk24_generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//**TŸ���� ��ü�� ��� Ŭ�������� ����� �����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������
		
		GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());//** �����ڰ� �ٷε����� �̸����� ��ü�� �����Ѱ� **
		Powder powder=powderPrint.getMaterial();// ������ �����°��� powder�� ����
		System.out.println(powderPrint);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrint=new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic=plasticPrint.getMaterial(); //�ٿ�ĳ���� ���ص���
		System.out.println(plasticPrint);
		System.out.println(plastic);
		
		//���� ���� ���Ǽ��� �ȵ����� ���׸� Ư���� ���Ǵ� ����� �߻��ϱ⶧����
		//���������� �� �߻�Ŭ������ ����� ��ӹ��� Ŭ������ �����Ҽ� �ְ� ������ش�
		/*GenericPrinter<Water> waterPrint=new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());
		Water water=waterPrint.getMaterial();
		System.out.println(water);*/
				
	}

}
