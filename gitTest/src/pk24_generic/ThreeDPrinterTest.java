package pk24_generic;
//자바 1.5버전 이전 일반(제네릭사용전)
public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreePrinter printer= new ThreePrinter();
		
		Powder p1= new Powder();
		printer.setMaterial(p1);
		
		//다운캐스팅
		Powder p2=(Powder)printer.getMaterial();
		System.out.println(p2);
		
		
		
	}

}
