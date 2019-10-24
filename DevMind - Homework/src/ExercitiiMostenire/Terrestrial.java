package ExercitiiMostenire;

public class Terrestrial extends Animal {
	
	private int legs;
	private int eyes;
	private int weight;

	public Terrestrial(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
	}
	
	public Terrestrial(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species);
		this.legs = legs;
		this.eyes = eyes;
	}
	
	public void fight() {
		System.out.println("\t The TERRESTRIAL animal is now fighting!\n");
	}
	
	@Override
	public void move(int distance) {
		System.out.println("\t This is a non-specific TERRESTRIAL animal!");
		super.move(distance);
	}
	
	@Override
	public void description() {
		System.out.println("\t The TERRESTRIAL animal has " + this.legs + " legs and " + this.eyes + " eyes \n");
		//super.description();
	}
	
	@Override
	public void saySomething() {
		System.out.println("\t Unknown sound for TERRESTRIAL animal!");
	}
}
