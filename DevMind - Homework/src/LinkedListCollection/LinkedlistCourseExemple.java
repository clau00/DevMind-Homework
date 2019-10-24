package LinkedListCollection;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedlistCourseExemple {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int searchKey(List<String> towns, String key) {
		int counter = 0;
		for(String el : towns) {
			if(el.equals(key)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static int searchKey2(Iterable<String> towns, String key) {
		int counter = 0;
		for(Iterator<String> it = towns.iterator(); it.hasNext();) {
			if(it.next().equals(key)) {
				counter++;
			}
		}
		return counter;
	}
	
	private static void printManual() {
		System.out.println("\t Options are: \n"
						 + "\t 0 = exit \n"
						 + "\t 1 = next element \n"
						 + "\t 2 = previous element \n"
						 + "\t 3 = print manual \n");
	}
	
	private static void iterate(LinkedList towns) {
		ListIterator li = towns.listIterator();
		boolean moveForward = true;
		printManual();
		
		while(true) {
			int option = sc.nextInt();
			switch (option) {
			case 0:
				System.out.println("\t EXIT!");
				return;
			case 1:
				if(!moveForward) {
					moveForward = true;
					if(li.hasNext()) {
						li.next();
					}
				}
				if (li.hasNext()) {
					System.out.println(li.next());
				}
				break;
			case 2:
				if(moveForward) {
					moveForward = false;
					if(li.hasPrevious()) {
						li.previous();
					}
				}
				if(li.hasPrevious()) {
					System.out.println(li.previous());
				}
				break;
			case 3:
				printManual();
				break;
			default:
				System.out.println("\t Unknown value!");
				printManual();
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		
		LinkedList<String> towns = new LinkedList<>();
		
		towns.add("Town 1");
		towns.add("Town 2");
		towns.add("Town 3");
		towns.add("Town 4");
		towns.add("Town 5");
		//iterate(towns);
		
		ArrayList<String> arrList = new ArrayList();
		arrList.add("Town 1");
		arrList.add("Town 2");
		
		System.out.println(searchKey(arrList, "Town 2"));
		System.out.println(searchKey2(arrList, "Town 1"));
//		for(int i=0; i<towns.size(); i++) {
//			System.out.println("Current town: " + towns.get(i));
//		}
//		System.out.println();
//		
//		Iterator<String> i = towns.iterator();
//		while(i.hasNext()) {
//			System.out.println("Iterated town: " + i.next());
//		}
//		System.out.println();
//		
//		for(String it : towns) {
//			System.out.println(" Enhanched for town: " + it);
//		}
//		System.out.println();
//		
//		ListIterator<String> listIt = towns.listIterator();
//		
//		while(listIt.hasNext()) {
//			System.out.println(" ListIterator town: " + listIt.next());
//		}
//		System.out.println();
//		
//		while(listIt.hasPrevious()) {
//			System.out.println(" ListIterator town: " + listIt.previous());
//		}
//		System.out.println();
	}
}
