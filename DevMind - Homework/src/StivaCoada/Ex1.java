package StivaCoada;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ex1 {

	private String parantheses = "()[]{}"; 
	private Deque<Character> listOfParantheses;
	
	public Ex1() { 
		listOfParantheses = new ArrayDeque();
	}
	
	public static boolean checkValidity(String str) {
		Ex1 pile = new Ex1();
		
		for(int i=0; i<str.length(); i++) {
			int position = pile.parantheses.indexOf(str.charAt(i));
			//System.out.println(str.charAt(i) + "  " + position);
			if(position % 2 == 0) {
				pile.listOfParantheses.push(str.charAt(i));
				//System.out.println("\t\t\t" + pile.listOfParantheses);
			}else if(position % 2 == 1) {
				if(pile.listOfParantheses.isEmpty()) {
					return false;
				}else if(pile.listOfParantheses.peek() == pile.parantheses.charAt(position-1)) {
					pile.listOfParantheses.pop();
				}else {
					System.out.println("\t Nu este un sir valid de paranteze!");
					return false;				}
			}
		}
		if(!pile.listOfParantheses.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

	
	public static void main(String[] args) {
		String str = "()(([])){[[()]]}";

		if(checkValidity(str)) {
			System.out.println("\t Sirul \"" + str + "\" indeplineste conditiile!");
		}else {
			System.out.println("\t Sirul \"" + str + "\" NU indeplineste conditiile!");
		}
		
	}
}
