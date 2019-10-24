package IerarhieDeVehicule;

public class OnAir extends Vehicle {

	int noTurbines;
	boolean hasFirstClass;
	
	public OnAir(String serialNumber, int noPersons) {
		this(serialNumber, noPersons, "unknown", -1, false);
	}

	public OnAir(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons, name, -1, false);
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
		this(serialNumber, noPersons, name, noTurbines, false);
	}

	public OnAir(String serialNumber, int noPersons, String name, int noTurbines, boolean hasFirstClass) {
		super(serialNumber, noPersons, name);
		this.noTurbines = noTurbines;
		this.hasFirstClass = hasFirstClass;
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
		System.out.println("\t Airplane properties: \n" + 
						   "\t  - number of turbines: " + this.noTurbines + "\n" +
						   "\t  - " + (this.hasFirstClass ? "has first class \n" : "does not have first class \n"));
	}
}
