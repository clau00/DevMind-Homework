package LinkedList;

import java.util.Scanner;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double[] values = {24.15, 24.15, 3.33, 1.01, 19.30, 16.11};
		SinglyLinkedList<Double> list = new SinglyLinkedList<Double>(values);
		
		// 1. Iterate over elements.
		System.out.println("\t Iterate over elements.");
		list.iterate();
		System.out.println();
		
		System.out.println("\t LIST SIZE: " + list.size());
		
		// 2. Search for an element
		System.out.println("\t Search for an element: ");
		double searchKey = sc.nextDouble();
		System.out.println("\t Element "+ searchKey + " exists? Answer: " + list.find(searchKey));
		System.out.println();
		
		// 3. Insert an element
		System.out.println("\t Insert an element: ");
		double newElem = sc.nextDouble();
		System.out.println("\t At position: ");
		int newElemPosition = sc.nextInt();
		list.insert(newElem, newElemPosition);
		list.iterate();
		System.out.println();
		
		// 4. Remove an element
		System.out.println("\t Remove element from position: ");
		int removeElemPosition = sc.nextInt();
		list.remove(removeElemPosition);
		list.iterate();
	}
}
