package pk24_generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//**T타입의 객체는 모든 클래스에서 상속이 가능하여 자동으로 클래스로 형변환이 가능함
		
		GenericPrinter<Powder> powderPrint=new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());//** 생성자가 바로들어갈떄는 이름없는 객체를 생성한것 **
		Powder powder=powderPrint.getMaterial();// 가지고 내려온것을 powder에 저장
		System.out.println(powderPrint);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrint=new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic=plasticPrint.getMaterial(); //다운캐스팅 안해도됨
		System.out.println(plasticPrint);
		System.out.println(plastic);
		
		//물의 재료는 허용되서는 안되지만 제네릭 특성상 허용되는 모순이 발생하기때문에
		//제약조건을 건 추상클래스를 만들어 상속받은 클래스만 구현할수 있게 만들어준다
		/*GenericPrinter<Water> waterPrint=new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());
		Water water=waterPrint.getMaterial();
		System.out.println(water);*/
				
	}

}
