package pk24_generic;
//�ڹ� 1.5���� ���� �Ϲ�(���׸������)
public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreePrinter printer= new ThreePrinter();
		
		Powder p1= new Powder();
		printer.setMaterial(p1);
		
		//�ٿ�ĳ����
		Powder p2=(Powder)printer.getMaterial();
		System.out.println(p2);
		
		
		
	}

}
