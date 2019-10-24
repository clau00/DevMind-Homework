package MetodeAbstracteFormeGeometrice;

public abstract class Shape {

	private String text;
	private String material;
	
	public Shape() {
		this.text = "";
		this.material = "";
	}
	
	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}
	
	public abstract int getSize();
	
	public abstract String toString();
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();
	
}
