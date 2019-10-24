package CompunereAgregare;

import java.util.ArrayList;

public class Screen {

	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;
	
	public Screen(int pixelsNo, int width, int length, int depth) {
		pixels = new ArrayList<Pixel>();
		for(int i=0; i<pixelsNo; i++) {
			this.pixels.add(new Pixel());
		}
		this.dimensions = new Dimensions(width, length, depth);
	}
	
	public void setPixel(int pixelId, String color) {
		System.out.println("\t Screen colored pixelId " + pixelId + " in " + color + ".");
		this.pixels.get(pixelId).setPixel(color);
	}
	
	public void colorScreen(String color) {
		System.out.println("\t Screen colored in " + color + ".");
		for(int i=0; i<this.pixels.size(); i++) {
			this.pixels.get(i).setPixel(color);
		}
	}
 }
