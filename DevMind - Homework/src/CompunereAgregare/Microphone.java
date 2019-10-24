package CompunereAgregare;

public class Microphone {

	private int maxVolume;
	private int crtVolume;
	
	public Microphone(int maxVolume) {
		this(maxVolume, maxVolume / 4);
	}
	
	public Microphone(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}
	
	public boolean increaseVolume() {
		if(this.crtVolume < this.maxVolume) {
			this.crtVolume++;
			System.out.println("\t class Microphone -> volume incresed");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean decreaseVolume() {
		if(this.crtVolume > 0) {
			this.crtVolume--;
			System.out.println("\t class Microphone -> volume decreased");
			return true;
		}else {
			return false;
		}
	}
	
	public void muteMicrophone() {
		this.crtVolume = 0;
		System.out.println("\t class Microphone -> MUTE");
	}
	
//	public int getMicroVol() {
//		return this.crtVolume;
//	}
}
