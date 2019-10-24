package IerarhieDeVehicule;

public class OnWater extends Vehicle{
	
	int noEngines;
	int cargoCapacity;
	
	public OnWater(String serialNumber, int noPersons) {
		this(serialNumber, noPersons, "unknown", 4, 4);
	}
	
	public OnWater(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons, name, 4, 4);
	}
	
	public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
		this(serialNumber, noPersons, name, noEngines, -1);
	}
	
	public OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("\t Sailing the vessel to coordinates: [" + positionX + "], [" + positionY + "]");
		return true;
	}
	
	@Override
	public boolean addFuel(double amount) {
		System.out.println("\t Adding " + amount + " l of fuel to the vessel");
		return true;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("\t Vessel properties: \n" + 
						   "\t  - number of engines: " + this.noEngines + "\n" + 
						   "\t  - cargo capacity: " + this.cargoCapacity + "\n");
	}
}
