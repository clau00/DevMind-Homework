package ArrayListColectiiJava;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void printArrayList(ArrayList<String> a) {
		System.out.println("\t");
		for(int i=0; i<a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Andrei");
		a.add("Ion");
		a.add("Gigi");
		a.add("Alina");
		a.add("Crina");
		a.add(2, "Andrei");
		a.add(3, "Ana");
		
		printArrayList(a);
		
		System.out.println("\t ArrayList-ul 'a' are: ");
		System.out.println("\t  - Size: " + a.size());
		System.out.println("\t  - Contine Andrei, 2, Vio?: " + a.contains("Ion") + " " + a.contains(Double.valueOf(2)) + " " + a.contains("Vio"));
		System.out.println("\t  - Get elem. de pe poz 2 si 4: " + a.get(2) + " " + a.get(4));
		System.out.println("\t  - IndexOf and LastIndexOf Andrei: " + a.indexOf("Andrei") + " " + a.lastIndexOf("Andrei"));
		
		System.out.println("\t  - Remove index 0: " + a.remove(0));
		printArrayList(a);
		
		a.clear();
		System.out.println("\t Print cleared 'a': ");
		printArrayList(a);
		
		a.add("ooo");
		System.out.println("\t Set index 0: " + a.set(0, "III"));
		printArrayList(a);
	}
}
