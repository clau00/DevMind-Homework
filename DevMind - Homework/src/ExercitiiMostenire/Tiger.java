package ExercitiiMostenire;

public class Tiger extends Terrestrial{

	public Tiger(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species, legs, eyes);
	}
	
	@Override
	public void saySomething() {
		System.out.println("\t Tigerrrrrrr.....");
		//super.saySomething();
	}
	
	public void arrr() {
		System.out.println("\t Tiger arrrrr");
	}
}
