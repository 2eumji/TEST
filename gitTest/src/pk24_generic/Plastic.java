package pk24_generic;

public class Plastic extends Material{ //추상클래스 상속
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}

	
	
}
