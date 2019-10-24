package ExercitiiMostenire;

public class Aquatic extends Animal {

	private int eyes;
	
	public Aquatic(boolean carnivore, int weight, int size, String species) {
		super(carnivore, weight, size, species);
	}

	public void swim() {
		System.out.println("\t The AQUATIC animal started to swim \n");
		super.description();
	}
}
