package pk24_generic;

public class GenericPrinter<T extends Material> { //���ʸ�Ŭ������ ����  ����Ұ͸� ���� Ŭ������ ��ӹް��Ѵ�.
	
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
