package CompunereAgregare;

public class TestSmartphone {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone(50, 5, 10, 1, 100, 100);
		
		smartphone.setPixel(6, "#FF12341");
		System.out.println("\t " + smartphone.increaseMicrophoneVolume() + "\n");
		smartphone.muteMicrophone();
		System.out.println("\t " + smartphone.decreaseMicrophoneVolume() + "\n");
	}
}
