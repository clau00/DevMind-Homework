package IerarhieDeVehicule;

public class OnRoad extends Vehicle {
	
	int noWheels;
	int noDoors;
	
	public OnRoad(String serialNumber, int noPersons) {
		this(serialNumber, noPersons, "unknown", 4, 4);
	}
	
	public OnRoad(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons, name, 4);
	}
	
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
		this(serialNumber, noPersons, name, noWheels, 4);
	}
	
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
		this.noDoors = noDoors;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("\t Driving the vehicle on road to coordinates: [" + positionX + "], [" + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("\t Adding " + amount + " l of fuel to the driving vehicle");
		return true;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("\t Driving vehicle properties: \n" + 
						   "\t  - number of wheels: " + this.noWheels + "\n" + 
						   "\t  - number of doors: " + this.noDoors + "\n");
	}
			
}
