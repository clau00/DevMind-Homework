package MetodeAbstracteFormeGeometrice;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this(width, height, "", "");
	}
	
	public Rectangle(int width, int height, String text, String material) {
		super(text, material);
		this.width = width;
		this.height = height;
	}
	
	public void displayRectangleHeight() {
		System.out.println("\t Rectangle height is: " + this.height);
	}
	
	@Override
	public int getSize() {
		return this.width * this.height;
	}
	
	@Override
	public String toString() {
		return "Rectangle: height is " + this.height + ", width is: " + this.width;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Rectangle rectangleObj = (Rectangle) obj;
		if(this.height == rectangleObj.height && 
				this.width == rectangleObj.width) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int result = 1;
		
		result = prime * result + this.height;
		result = prime * result + this.width;
		
		return result;
	}
}
