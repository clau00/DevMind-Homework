package StivaCoada;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DocPile {

	private Deque<String> pile;
	
	public DocPile(String containerType) {
		switch(containerType) {
		case "LinkedList":
			pile = new LinkedList();
			break;
		case "ArrayDeque":
			pile = new ArrayDeque();
			break;
		default:
			System.out.println("\t Invalid input! Using the default: ArrayDeque");
			pile = new ArrayDeque();
			break;
		}
	}
	
	public DocPile(Deque<String> pile) {
		this.pile = pile;
	}
	
	public DocPile() {
		pile = new ArrayDeque();
	}
	
	public String readDoc() {
		return pile.peek();
	}
	
	public void addDoc(String doc) {
		pile.push(doc);
	}
	
	public String removeDoc() {
		return pile.pop();
	}
	
	public boolean isEmpty() {
		return pile.isEmpty();
	}
}
