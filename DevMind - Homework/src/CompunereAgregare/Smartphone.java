package CompunereAgregare;

public class Smartphone {

	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;
	
//	public Smartphone(Screen theScreen, Case theCase, Speaker theSpeaker, Microphone theMicrophone) {
//		this.theScreen = theScreen;
//		this.theCase = theCase;
//		this.theSpeaker = theSpeaker;
//		this.theMicrophone = theMicrophone;
//	}

	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
						int microMaxVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol);
		this.theMicrophone = new Microphone(microMaxVol);
	}
	
	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
						int speakerCrtVol, int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
	}
	
	public void pressVolumeUp() {
		System.out.println("\t class Smartphone: delegate to Case ->");
	    this.theCase.pressVolumeUp();
	    System.out.println("\t class Smartphone: delegate to Speaker ->");
	    this.theSpeaker.increaseVolume();
	  }
	 
	  public void pressVolumeDown() {
		  System.out.println("\t class Smartphone: delegate to Case ->");
		  this.theCase.pressVolumeDown();
		  System.out.println("\t class Smartphone: delegate to Speaker ->");
		  this.theSpeaker.decreaseVolume();
	  } 
	  
	  public void setPixel(int pixelId, String color) {
		  System.out.println("\t class Smartphone: delegate to Screen ->");
		  this.theScreen.setPixel(pixelId, color);
	  }
	  
	  public void colorScreen(String color) {
		  System.out.println("\t class Smartphone: delegate to Screen ->");
		  this.theScreen.colorScreen(color);
	  }
	  
	  public boolean increaseMicrophoneVolume() {
		  System.out.println("\t class Smartphone: delegate to Microphone ->");
		  return this.theMicrophone.increaseVolume();
	  }
	  
	  public boolean decreaseMicrophoneVolume() {
		  System.out.println("\t class Smartphone: delegate to Microphone ->");
		  return this.theMicrophone.decreaseVolume();
	  }
	  
	  public void muteMicrophone() {
		  System.out.println("\t class Smartphone: delegate to Microphone ->");
		  this.theMicrophone.muteMicrophone();
	  }
	  
	  public void setSilenceMode() {
		  System.out.println("\t class Smartphone: delegate to Speaker ->");
		  this.theSpeaker.setSilenceMode();
	  }
	  
//	  public int getMicroVol() {
//		  return this.theMicrophone.getMicroVol();
//	  }
}
