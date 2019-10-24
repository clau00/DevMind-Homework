package Polimorfism;

public class Test {

	public static void main(String[] args) {
		Smartphone s = new Smartphone("OLED", 25, 100, "RED", 5, 10, 1);
		Phone p = s;
		
		System.out.println("\t polimorfism dinamic \n");
		p.description();
		s.description();
		
		System.out.println("\n\t ============================================== \n\n"
				+ "\t polimorfism static \n");
		s.increaseVolMicrophone();
		s.increaseVolMicrophone(37);
		
	}
}
