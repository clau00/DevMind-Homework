package Polimorfism;

public class Smartphone extends Phone{

	private String theScreen;
	private Microphone theMicrophone;
	private String color;
	
	public Smartphone(String theScreen, int crtVol, int maxVol, String color, int width, int length, int height) {
		super(width, length, height);
		this.theMicrophone = new Microphone(crtVol, maxVol);
		this.theScreen = theScreen;
		this.color = color;
	}
	
	@Override
	public void description() {
		System.out.println("\t This is a Smartphone, with the screen " + this.theScreen 
							+ " and colored: " + this.color + ".");
	}
	
	public boolean increaseVolMicrophone() {
		System.out.println("\t Smartphone delegate -> Microphone with 0 parameters");
		return this.theMicrophone.increaseVol();
	}
	
	public boolean increaseVolMicrophone(int unit) {
		System.out.println("\t Smartphone delegate -> Microphone with 1 parameters");
		return this.theMicrophone.increaseVol(unit);
	}
}
