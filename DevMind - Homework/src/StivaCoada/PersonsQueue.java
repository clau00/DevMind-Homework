package StivaCoada;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class PersonsQueue {

	private Queue<String> persons;
	
	public PersonsQueue(String containerType) {
		switch(containerType) {
		case "LinkedList":
			persons = new LinkedList<String>();
			break;
		case "ArrayDeque":
			persons = new ArrayDeque<String>();
			break;
		default:
			System.out.println("\t Invalid input, using default: ArrayDeque!");
			persons = new ArrayDeque<String>();
			break;
		}
	}
		
	public PersonsQueue(Queue<String> container) {
		this.persons = container;
	}
		
	public PersonsQueue() {
		this.persons = new ArrayDeque<String>();
	}
		
	public String whoIsNext() {
		return persons.peek();
	}
	
	public void addPerson(String person) {
		persons.offer(person);
	}
	
	public String servePerson() {
		return persons.poll();
	}
	
	public boolean areMorePErsons() {
		return !persons.isEmpty();
	}
}
