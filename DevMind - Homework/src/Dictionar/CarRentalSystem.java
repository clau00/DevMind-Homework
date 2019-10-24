package Dictionar;

import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {
	
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, String> rentedCars = new HashMap<String, String>();
	
	public boolean isCarRented(String rentedCar) {
		return rentedCars.containsKey(rentedCar);
	}
	
	public String theCarIsRentedTo(String rentedCar) {
		if(!isCarRented(rentedCar)) {
			System.out.println("\t The plate No is not registered!");
			return "";
		}
		return rentedCars.get(rentedCar);
	}
	
	public void removeCar(String removedCar) {
		if(!isCarRented(removedCar)) {
			System.out.println("\t The plate No is not registered!");
			return;
		}
		rentedCars.remove(removedCar);
	}
	
	public void addNewCar(String newCar, String newOwner) {
		if(isCarRented(newCar)) {
			System.out.println("\t The plate No is already registered!");
			return;
		}
		rentedCars.put(newCar, newOwner);
	}
	
	public int getTotalRentedCars() {
		return rentedCars.size();
	}
	
	public void printCommands() {
		System.out.println("help         	- Afiseaza aceasta lista de comenzi");
	    System.out.println("add          	- Adauga o noua pereche (masina, sofer)");
	    System.out.println("check        	- Verifica daca o masina este deja luata");
	    System.out.println("remove       	- Sterge o masina existenta din hashtable");
	    System.out.println("getOwner     	- Afiseaza proprietarul curent al masinii");
	    System.out.println("totalRented     - Afiseaza proprietarul curent al masinii");
	    System.out.println("quit         	- Inchide aplicatia");
	}
	
	public void run() {	
		boolean repeat = true;
		
		while(repeat) {
			System.out.println("\n\t Astept comanda. (help - afiseaza comenzile disponibile!");
			String command = sc.nextLine();
			
			switch(command) {
			case "help":
				printCommands();
				break;
			case "add":
				System.out.println("\t Introduceti numarul masinii.");
				String plateNo = sc.nextLine();
				System.out.println("\t Introduceti proprietarul.");
				String owner = sc.nextLine();
				addNewCar(plateNo, owner);
				break;
			case "check":
				System.out.println("\t Introduceti numarul masinii cautate.");
				System.out.println(isCarRented(sc.nextLine()));
				break;
			case "remove":
				System.out.println("\t Introduceti numarul masinii de sters.");
				removeCar(sc.nextLine());
				break;
			case "getOwner":
				System.out.println("\t Introduceti numarul masinii pt a afla proprietarul.");
				System.out.println(theCarIsRentedTo(sc.nextLine()));
				break;
			case "totalRented":
				System.out.println("\t Total number of rented cars: " + getTotalRentedCars());
				break;
			case "quit":
				System.out.println("\t SYSTEM CLOSING!");
				sc.close();
				repeat = false;
				break;
			default: 
				System.out.println("\t Wrong input!");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		CarRentalSystem rentalSystem = new CarRentalSystem();
		rentalSystem.run();
	}
}
