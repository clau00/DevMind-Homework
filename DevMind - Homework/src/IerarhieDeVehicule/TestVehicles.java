package IerarhieDeVehicule;

public class TestVehicles {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("vehicle1111", 4, "Vehicle 1");
		Vehicle vehicle2 = new Vehicle("vehicle2222", 4);
		
		OnRoad road1 = new OnRoad("road1111", 2, "on road 1", 0, 2);
		OnRoad road2 = new OnRoad("road2222", 4, "on road 2", 2);
		OnRoad road3 = new OnRoad("road3333", 4, "on road 3");
		OnRoad road4 = new OnRoad("road4444", 3);
		
		OnWater water1 = new OnWater("water1111", 100, "on water 1", 4, 1000);
		OnWater water2 = new OnWater("water2222", 200, "on water 2", 2);
		OnWater water3 = new OnWater("water3333", 300, "on water 3");
		OnWater water4 = new OnWater("water4444", 400);

		
		OnAir air1 = new OnAir("air1111", 120, "on air 1", 2, true);
		OnAir air2 = new OnAir("air2222", 200, "on air 2", 2);
		OnAir air3 = new OnAir("air3333", 300, "on air 3");
		OnAir air4 = new OnAir("air4444", 400);

		
		System.out.println("\t =========================\n");
		
		vehicle1.getSerialNumber();
		vehicle1.goTo(23.45, 54.23);
		vehicle1.addFuel(100.32);
		vehicle1.printInfo();	
		vehicle2.printInfo();
		
		System.out.println("\t =========================\n");
		
		road1.getSerialNumber();
		road1.goTo(23.45, 54.23);
		road1.addFuel(100.32);
		road1.printInfo();
		System.out.println("\t -------------------------");
		road2.printInfo();
		System.out.println("\t -------------------------");
		road3.printInfo();
		System.out.println("\t -------------------------");
		road4.printInfo();
		
		System.out.println("\t =========================");
		
		water1.getSerialNumber();
		water1.goTo(23.45, 54.23);
		water1.addFuel(100.32);
		water1.printInfo();
		System.out.println("\t -------------------------");
		water2.printInfo();
		System.out.println("\t -------------------------");
		water3.printInfo();
		System.out.println("\t -------------------------");
		water4.printInfo();
		
		System.out.println("\t =========================\n");
		
		air1.getSerialNumber();
		air1.goTo(23.45, 54.23);
		air1.addFuel(100.32);
		air1.printInfo();
		System.out.println("\t -------------------------");
		air2.printInfo();
		System.out.println("\t -------------------------");
		air3.printInfo();
		System.out.println("\t -------------------------");
		air4.printInfo();
		
		System.out.println("\t =========================\n");
	}
}
