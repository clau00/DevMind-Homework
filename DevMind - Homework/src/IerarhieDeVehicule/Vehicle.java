package IerarhieDeVehicule;

public class Vehicle {
	
	private final String serialNumber;
	private int noPersons;
	private String name;
	
	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;
	}
	
	public final String getSerialNumber() {
		System.out.println("\t The serial number of the VEHICLE, is: " + this.serialNumber);
		return this.serialNumber;
	}
	
	public boolean goTo(double positionX, double positionY) {
		System.out.println("\t Error: unknown vehicle cannot move...");
		return false;
	}
	
	public boolean addFuel(double amount) {
		System.out.println("\t Error: unknown type of vehicle...");
		return false;
	}
	
	public void printInfo() {
		System.out.println("\t Vehicle properties: \n" + 
						   "\t  - serial number: " + this.serialNumber + "\n" +
						   "\t  - capacity: " + this.noPersons + " persons" + "\n" + 
						   "\t  - name: " + this.name + "\n");
	}
}
