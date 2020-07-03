package pk24_generic;

public class ThreePrinter {
	
	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
}
