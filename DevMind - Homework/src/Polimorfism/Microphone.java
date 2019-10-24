package Polimorfism;

public class Microphone {

	int crtVol;
	int maxVol;
	
	public Microphone(int crtVol, int maxVol) {
		this.crtVol = crtVol;
		this.maxVol = maxVol;
	}
	
	public boolean increaseVol() {
		if(this.crtVol < this.maxVol) {
			this.crtVol++;
			System.out.println("\t Volume increased by 1.");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean increaseVol(int unit) {
		if(this.crtVol < this.maxVol - unit) {
			this.crtVol += unit;
			System.out.println("\t Volume increased by " + unit + " units.");
			return true;
		}else {
			return false;
		}
	}

}
