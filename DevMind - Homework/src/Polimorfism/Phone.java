package Polimorfism;

public class Phone {

	private int width;
	private int length;
	private int height;
	
	public Phone() {
	}
	
	public Phone(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public void description() {
		System.out.println("\t This is a PHONE");
	}
}
