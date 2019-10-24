package ArrayListColectiiJava;

import java.util.ArrayList;

public class FrecventaMaxima {
	
	public static void printAllaryList(ArrayList<Integer> a) {
		System.out.println("\t");
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int[] a = {1, 2, 3, 1, 1, 2, 4, 4, 2, 5};
		ArrayList<Integer> rA = new ArrayList<Integer>();
		
		int max = 0;
		for(int i=0; i<a.length; i++) {
			
			int freq = 1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					freq++;
				}
			}
			if(freq > max) {
				max = freq;
				rA.clear();
				rA.add(Integer.valueOf(a[i]));
			}else if(freq == max) {
				rA.add(Integer.valueOf(a[i]));
			}
		}
		
		printAllaryList(rA);
	}
}
