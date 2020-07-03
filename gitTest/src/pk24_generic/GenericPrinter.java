package pk24_generic;

public class GenericPrinter<T extends Material> { //제너릭클래스의 제한  사용할것만 넣은 클래스를 상속받게한다.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
